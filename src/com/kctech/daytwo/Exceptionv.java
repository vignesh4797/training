package com.kctech.daytwo;

public class Exceptionv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int a=20;
		int b=5;
		int c=2;
		int d=0;
		try {
		c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("something wromng here");
		} finally {
			System.out.println(c);
		}
	}

}
