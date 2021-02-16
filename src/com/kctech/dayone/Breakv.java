package com.kctech.dayone;

import java.util.Scanner;

class Breakv {
    public static void main(String[] args) {
      
        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
      
        while (true) {
            System.out.print("Enter a number: ");

            // takes double input from user
            number = input.nextDouble();
         
            // if number is negative the loop terminates
            if (number < 0.0) {
                break;
            }
         
           sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
