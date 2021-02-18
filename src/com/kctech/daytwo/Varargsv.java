package com.kctech.daytwo;

class Bat{
	
	public int addition(int ...a)  //a[]={1,2,4}
	{
		int sum=0;
		
		for (int b: a)
		{
			sum=sum+b;
		}
		return sum;
		
	}
	
}


public class Varargsv {

	public static void main(String[] args) {

		Bat hh = new Bat();
		hh.addition(20,20);//
		
		System.out.println(hh.addition(4,5,8,5));

	}

}
