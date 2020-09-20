package com.qa.pattern5;

public class Pattern46 
{

	public static void main(String[] args) 
	{
	  for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i<=j)
			  {
				  System.out.print(" "+i);
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
