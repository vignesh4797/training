package com.kctech.dayone;

public class Conmethod {

	  // create a method
	  public String concatination(String a, String b) {
	    
	    // return value
	    return (a+b);
	  }

	  public static void main(String[] args) {
	    
	    String a= "hello";
	    String b= "java";

	    // create an object of Main
	    Conmethod obj = new Conmethod();
	    System.out.println(obj.concatination(a ,b));
	    
	  }
	}