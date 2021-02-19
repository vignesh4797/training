package com.kctech.daythree;

import java.util.LinkedList;

public class Linkedlistv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> row = new LinkedList  <String>();
		 
		  row.add("arab");//adding object in linkedlist    
		  row.add("india");    
		  row.add("austria");    
		  row.add("europ");
		  row.set(2, "nepal");
		  row .remove("nepal");
		  System.out.println(row);

	}

}
