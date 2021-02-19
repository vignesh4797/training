package com.kctech.daythree;

import java.util.ArrayList;
public class Arraylistv {
	
	

	public static void main(String[] args) {
		
		
		
	 ArrayList<String> war = new ArrayList<String>();
	    
		war.add("Volvo");
	    war.add("BMW");
	    war.add("Ford");
	    war.add("Mazda");
	    war.remove("Ford");
	    war.set(0,"yamaha");
	  System.out.println( war);
	  
	  
	  
	  
	  ArrayList<Integer> war2 = new ArrayList<Integer>();
	    
	    war2.add(10);
	    war2.add(12);
	    war2.add(60);
	    war2.add(17);
	    war2.add(30);
	    war2.set(2,15);
	    
	    for (int i : war2) {
	        System.out.println(i);
	      }
	    
	}

}
