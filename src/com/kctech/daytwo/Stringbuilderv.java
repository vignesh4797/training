package com.kctech.daytwo;


public class Stringbuilderv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("java");
		System.out.println(sb);
		
		sb.insert(0,"Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		
		sb.reverse();
		System.out.println(sb);
		//2
		StringBuilder dd = new StringBuilder ("java script");
	     dd.delete(2, 3);
	     System.out.println(dd);
		
		
	}
	
		

}
