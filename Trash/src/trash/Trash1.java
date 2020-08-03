package trash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Trash1 {

	public static void main(String args[])
	{
		 rec(2);
	}
	
	public static void rec(int start)
	{
		for(int i=start;i<4;i++)
		{
			System.out.println(i);	

			rec(i+1);
			System.out.println("after rec "+ start+" value of i "+ i);	
		}
		
		
	}
}


  