package trash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {

	String color;
	int power;
	public Card(String color, int power)
	{
		this.color=color;
		this.power=power;
	}
	public static List<Card> generatecards()
	{
		ArrayList<Card> card = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			Card c2=new Card("red",i);
			card.add(c2);
		}
		for(int i=0;i<10;i++)
		{
			card.add(new Card("green",i));
		}
		
		for(int i=0;i<10;i++)
		{
			card.add(new Card("blue",i));
		}
		
		
		return card;
		
	}
	public static List<Card> generateHand(List<Card> card)
	{
		Collections.shuffle(card);
		List<Card> generate=new ArrayList<>();
		for(int i=0;i<7;i++)
		{
			generate.add(card.get(i));
			System.out.println(card.get(i).color+ " "+card.get(i).power);
			card.remove(i);

		}
		System.out.println("=====================");
		for(int i=0;i<23;i++)
		{
			System.out.println(card.get(i).color+" "+card.get(i).power);
		}
		return generate;
		
	}
	public static void main(String[] args) {
		
		ArrayList<Card> card= (ArrayList<Card>) Card.generatecards();
//		for(int i=0;i<30;i++)
//		{
//			System.out.println(card.get(i).color+ " " +card.get(i).power);
//		}
		
		ArrayList<Card> generated=(ArrayList<Card>) generateHand(card);
//		for(int i=0;i<7;i++)
//		{
//			System.out.println(generated.get(i).color+ " " +generated.get(i).power);
//		}
		
		System.out.println("=========================");
//		ArrayList<Card> generated1=(ArrayList<Card>) generateHand(card);
//		for(int i=0;i<7;i++)
//		{
//			System.out.println(generated1.get(i).color+ " " +generated1.get(i).power);
//		}
		

	}

}
