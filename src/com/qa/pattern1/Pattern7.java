package com.qa.pattern1;

public class Pattern7 
{

	public static void main(String[] args) 
	{
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=12;j++)
		  {
			  if(((i==j) || (j==i+1)) || ((i+j==12) || (i+j==13)))
			  {
				  System.out.print("* ");
			  }
			  else
			  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
	}

}
