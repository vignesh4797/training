package com.kctech.daytwo;


abstract class  Abstractv {
	  
	  
	public abstract void fz();
	 
	  public void yamaha() {
	    System.out.println("fz bike");
	 
	  }
	
}
   class bullet extends Abstractv {
	 
	public void bike() {
	    System.out.println("bullet bike");
	  }

	@Override
	public void fz() {
		// TODO Auto-generated method stub
		
	}
	}

	

class Main {
	  public static void main(String[] args) {
	    bullet my = new bullet(); 
	    my.yamaha();
	    my.bike();
	  }
	}