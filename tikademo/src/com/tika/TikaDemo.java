package com.tika;

import org.apache.tika.Tika;
import org.apache.tika.langdetect.OptimaizeLangDetector;
import org.apache.tika.language.LanguageIdentifier;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.detect.LanguageResult;

public class TikaDemo {

	public static void main(String[] args) {
		
		
//		Tika t=new Tika();
//		System.out.println(t.detect("home"));
		
//		System.out.println(t.translate("home", "en", "fr"));
		
		
		LanguageDetector detector = new OptimaizeLangDetector().loadModels();
        LanguageResult result = detector.detect("french");
         System.out.println(result.getLanguage());
         
         
         MicrosoftTranslator translator = new MicrosoftTranslator();
         // Change the id and secret! See http://msdn.microsoft.com/en-us/library/hh454950.aspx.
         translator.setId("dummy-id");
         translator.setSecret("dummy-secret");
         try {
             return translator.translate(text, "fr");
         } catch (Exception e) {
             return "Error while translating.";
         }

	}

}
