package com.kctech.dayone;

public class Breakvs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;
 
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
	}

}
