package com.qa.pattern4;

public class Pattern39 
{

	public static void main(String[] args) 
	{
	  char ch = 'A';
	  for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i>=j)
			  {
				  System.out.print(ch+" ");
				  ch++;
			  }
		  }
		  System.out.println();
	  }
	}

}
