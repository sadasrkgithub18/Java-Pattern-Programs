package com.qa.pattern4;

public class Pattern36 
{

	public static void main(String[] args) 
	{
	 int num = 15;
	 
	 for(int i=5;i>=1;i--)
	 {
		 for(int j=1;j<=5;j++)
		 {
			 if(i>=j)
			 {
				 System.out.print(num+"  ");
				 num--;
			 }
		 }
		 System.out.println();
	 }
	}

}
