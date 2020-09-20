package com.qa.pattern1;

public class Pattern4 
{

	public static void main(String[] args) 
	{
	  for(int i=5;i>0;i--)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i>=j)
			  {
				  System.out.print("* ");
			  }
		  }
		  System.out.println();
	  }
	}

}
