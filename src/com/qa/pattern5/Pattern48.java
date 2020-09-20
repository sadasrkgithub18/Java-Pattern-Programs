package com.qa.pattern5;

public class Pattern48 
{

	public static void main(String[] args) 
	{ 
	  int num=1;
	  for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i<=j)
			  {
				  System.out.print(num+" ");
			  }
			  else
			  {
				  System.out.print("   ");
			  }
			  num++;
		  }
		  
		  System.out.println();
	  }
	}

}
