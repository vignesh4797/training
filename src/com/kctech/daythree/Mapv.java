package com.kctech.daythree;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> rr = new HashMap<Integer, String> ();
		
		
		rr.put(1,"Amit");  
	    rr.put(5,"Rahul");  
	    rr.put(2,"Jai");  
	    rr.put(6,"Amit");
	    
        //System.out.println(rr.get(1));
	    
        //System.out.println(rr.get(5));
        
        //System.out.println(rr.get(4));
        
        //System.out.println(rr.get(6));
	//
        Set<Integer> keys = rr.keySet();
        
        
        
        
        
        for(Map.Entry m:rr.entrySet()){  
        	   System.out.println(m.getKey()+" "+m.getValue()); 
	
	}
	
	
	

	}
}
