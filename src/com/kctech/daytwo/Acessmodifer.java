package com.kctech.daytwo;

public class Acessmodifer {

	Integer ss= 123;
	float   r = 990 ;
	int     p = 543;
	
	
	
	public void addition()
	{
		System.out.println("result" + (ss+p));
	}
	private void sub()
	{
		int a = 34;
		int b = 45;
		int c = b-a;
		
		System.out.println("sub"+ (c));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acessmodifer add = new Acessmodifer() ;
		add.addition();
		add.sub();
		System.out.println();
		

	}

}
