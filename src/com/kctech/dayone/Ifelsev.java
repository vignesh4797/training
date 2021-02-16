package com.kctech.dayone;

import java.util.Scanner;

public class Ifelsev {

	public static void main(String[] args) {
		
		int pen=20;
		int inkpen=30;
		int cost;
		Scanner input = new Scanner(System.in);
		cost = input.nextInt();
	      
	    if(cost>inkpen){  
	        System.out.print("you can buy ink pen");  
	    }
	    else if(cost>pen)
	    {
	    	System.out.println("you can buy the pen");
	    }
	    else
	    {
	    	System.out.print("you can't buy");
	    }
	}

}
