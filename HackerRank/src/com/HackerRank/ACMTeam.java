package com.HackerRank;

public class ACMTeam {
	
	void acmTeam(String topics[])
	{
		int count=0, maxvalue=0;
		int fp=0, sp=0;
		for(int i=0;i<topics.length;i++)
		{
			for(int j=i+1;j<topics.length-1;j++)
			{
				for(int k=0;k<topics[i].length();k++)
				{
					if((topics[i].charAt(k) == '1' && topics[j].charAt(k)== '0') || (topics[i].charAt(k) == '0' && topics[j].charAt(k)== '1') || (topics[i].charAt(k) == '1' && topics[j].charAt(k)== '1'))
					{
						count=count+1;
						if(count>maxvalue)
						{
							maxvalue=count;
							fp=i;
							sp=j;
						}
					}
				}
				count=0;
			}
		}
		
		System.out.println(maxvalue + "  "+fp +"  "+ sp );
	}

	public static void main(String args[])
	{
		ACMTeam t=new ACMTeam();
		String[] topics = new String[4];
		topics[0]="10101";
		topics[1]="11100";
		topics[2]="11010";
		topics[3]="00101";
		
		t.acmTeam(topics);
		
		
		
	}
}