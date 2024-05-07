package com.family.myfamily;

import java.util.Vector;

public class Vecto 
{

	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add(10);
		l1.add("hi");
		l1.add(null);
		l1.add('a');
		l1.add(10.0);
		System.out.println(l1);
		System.out.println(l1.capacity());
		

	}

}
