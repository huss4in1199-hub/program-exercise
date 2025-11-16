
package com.mycompany.alculateinterest;

import java.util.Scanner;

public class AlculateInterest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
             
        Scanner input = new Scanner(System.in);
     
        System.out.println("What is your balance in  bank ");
        double balance = input.nextDouble();
        
        System.out.println("What is the annualInterestRate ");
        double annualInterestRate = input.nextDouble();
        
        double interest = balance*(annualInterestRate/1200);
        System.out.println("The interest is = "+interest);
        
    }
}
