package com.qa.pattern5;

public class Pattern43 
{

	public static void main(String[] args) 
	{
	 char ch ='A';
	 
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=5;j++)
		 {
			 if(i<=j)
			 {
				 System.out.print(ch+" ");
			 }
			 else
			 {
				 System.out.print("  ");
			 }
		 }
		 ch++;
		 System.out.println();
	 }
	}

}
