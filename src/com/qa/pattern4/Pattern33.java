package com.qa.pattern4;

public class Pattern33 
{

	public static void main(String[] args)
	{
	 
	 for(int i=1;i<=5;i++)
	 {
		 char ch = 'A';
		 for(int j=1;j<=5;j++)
		 {
			 if(i>=j)
			 {
				 System.out.print(ch +" ");
				 ch++;
			 }
		 }
		 
		 System.out.println();
	 }
	}

}
