package com.kctech.daythree;

import java.util.ArrayList;

import java.util.Iterator;

public class Itratorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
	    
		cars.add("vignesh");
	    cars.add("aneesh");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    
	    Iterator<String> it = cars.iterator();
	    //while(it.hasNext())
	    //{
	    //	String v;
	    //	v=it.next();
	    	System.out.println(it.next());
	    //}

	    // Print the first item
	    
	    
	}

}
