package com.qa.pattern3;

public class Pattern27 
{

	public static void main(String[] args) 
	{
	  int star  = 1;
	  int space = 7;
	  
	  for(int i = 1; i<=9 ; i++)
	  {
		  for(int j=1;j<=star;j++)
		  {
			  System.out.print("*");
		  }
		  
		  for(int k=1;k<=space;k++)
		  {
			  System.out.print(" ");
		  }
		  
		  
		  
		  if(i<=4)
		  {
			  star++;
			  space -=2;
			  
			  for(int m=1;m<=i;m++)
			  {
				  System.out.print("*");
			  }
		  }
		  
		  else if(i==5)
		  {
			  star--;
			  space +=2; 
			  for(int m=1;m<i;m++)
			  {
				  System.out.print("*");
			  }
		  }
		  else
		  {
			  star--;
			  space +=2;
			  for(int n=9;n>=i;n--)
			  {
				  System.out.print("*");
			  }
			  
		  }	  
		  System.out.println();
	  }
	}

}
