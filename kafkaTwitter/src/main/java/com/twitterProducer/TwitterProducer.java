package com.twitterProducer;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

public class TwitterProducer {
	
	Logger logger=LoggerFactory.getLogger(TwitterProducer.class.getName());
	
	public TwitterProducer(){}

	public static void main(String[] args) {
		new TwitterProducer().run();

	}
	
	public void run()
	{
		BlockingQueue<String> msgQueue = new LinkedBlockingQueue<String>(100);
		Client client =createtwitterClient(msgQueue);
		// Attempts to establish a connection.
		client.connect();
		
		KafkaProducer<String, String> producer=createProducer();
		
		while (!client.isDone()) {
			  String msg=null;
			try {
				msg = msgQueue.poll(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				client.stop();
			} 
			  if(msg!=null)
			  {
				  logger.info(msg);
				  producer.send(new ProducerRecord<String, String>("tweets",null,msg), new Callback() {
					
					public void onCompletion(RecordMetadata metadata, Exception exception) {
						if(exception!=null)
						{
							logger.error("something is wrong", exception);
						}
						
					}
				});
			  }
			}
		
		logger.info("end of application");

	}
	
	public Client createtwitterClient(BlockingQueue<String> msgQueue)
	{
		
		
		Hosts hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
		// Optional: set up some followings and track terms
//		List<Long> followings = Lists.newArrayList(1234L, 566788L);
		List<String> terms = Lists.newArrayList("corona");
//		hosebirdEndpoint.followings(followings);
		hosebirdEndpoint.trackTerms(terms);

		// These secrets should be read from a config file
		Authentication hosebirdAuth = new OAuth1("187ztf3hxmT3Nm3YonFzcAvEB", "hTqPaSjNXw21GXmPCey6CZBCZRoO1EbTkbVO4zMv77kN8Ikq0P", "2219941182-hJEd5re1y7lbZmVlyZySZvVsJf88fP6um3SsC3r", "BntHym97rzCisKS3BFXqrBgQbgokklZEBcqHXixGJQtX8");
		
		
		ClientBuilder builder = new ClientBuilder()
				  .name("Hosebird-Client-01")                              // optional: mainly for the logs
				  .hosts(hosebirdHosts)
				  .authentication(hosebirdAuth)
				  .endpoint(hosebirdEndpoint)
				  .processor(new StringDelimitedProcessor(msgQueue)); 

				Client hosebirdClient = builder.build();
				return hosebirdClient;
				
				
	}
	
	public KafkaProducer<String, String> createProducer(){
		
		Properties p=new Properties();
		 p.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
	        p.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	        p.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	        
	        //safe producer
	        p.setProperty(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, "true");
	        p.setProperty(ProducerConfig.ACKS_CONFIG, "all");
	        p.setProperty(ProducerConfig.RETRIES_CONFIG, Integer.toString(Integer.MAX_VALUE));
	        p.setProperty(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, "5");
	        
	        //high throughput producer at the expense of a bit of latency and cpu usage
	        p.setProperty(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");
	        p.setProperty(ProducerConfig.LINGER_MS_CONFIG, "20");
	        p.setProperty(ProducerConfig.BATCH_SIZE_CONFIG, Integer.toString(32*1024)); //32 KB
	        
	        KafkaProducer<String, String> kafkaProducer=new KafkaProducer<String, String>(p);
	        return kafkaProducer;
	}

}
