package trash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Trash
{
	public void maxOccur(String s)
	{
	    int[] count=new int[26];
	    
	   for(Character c1:s.toCharArray())
	   {
		   count[c1-'a']=count[c1-'a']+1;
	   }
	   
	   int max=0, index=0;
	  for(int i=0;i<26;i++)
	  {
		  if(count[i]>max)
		  {
			  max=count[i];
			  index=i;
		  }
	  }
	  
	  System.out.println(index+ " "+ max + " "+ Character.valueOf((char) ((char) 'a'+index)));
	  
	  
	   
	}
	public static void main(String args[])
	{
		
		 String s="aabbcc";
		 Trash t=new Trash();
		 t.maxOccur(s);
	}
	
}