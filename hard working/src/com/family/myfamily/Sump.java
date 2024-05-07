package com.family.myfamily;

public class Sump 
{
	 static void disp(int[]abb)
	{
		int sum=0;
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]%2==0)
			{
				sum=sum+abb[i];
			}
		}
		System.out.println(sum);
	}
	 public static void main(String[]args)
	 {
		 int[]arr= {10,21,30,41};
		 disp(arr);
	 }

}
