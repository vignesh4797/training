package com.kctech.daythree;

import java.util.Set;
import java.util.TreeSet;

public class Treev {

	public static void main(String[] args) {
		
		
		Set<String> set2=new TreeSet<String>();
        
		set2.add("Ravi");  
        
		set2.add("Vijay");  
        
        set2.add("Arun");  
        
        set2.add("Sumit");
        
        set2.add("Sumit");
        
        set2.add("Arun");
        
       
        for (String ir : set2) {
        	
        	System.out.println(ir);	
        
        }
	}

}
