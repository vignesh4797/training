package com.kctech.daytwo;
import java.io.*;
public class Uncheckedv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a= 0; 
	      int b = 10; 
	      int z = b/a;
	      try {
	  		 z = b/a;
	  		}
	  		catch(Exception e)
	  		{
	  			System.out.println("something wromng here");
	      
	      
	  		}	
		
	}

}
