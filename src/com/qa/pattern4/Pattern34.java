package com.qa.pattern4;

public class Pattern34 
{

	public static void main(String[] args) 
	{
	  for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i>=j)
			  {
				  System.out.print(" "+i);
			  }
		  }
		  System.out.println();
	  }
	}

}
