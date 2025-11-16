

package com.mycompany.computelun;

import java.util.Scanner;


public class ComputeLun {

    public static void main(String[] args) {

  
        Scanner input = new Scanner(System.in);
        
        
                System.out.println("Enter annual interest rate : ");
        double annualInterestRAte = input.nextDouble();

        System.out.println("Enter number of years as an Integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount : ");
        double loanAmount = input.nextDouble();

        //mohaseba nerkh bahra mahana
        double monthlyInterestRate = annualInterestRAte / 1200;

        //mohaseba pardakht mahana
        double monthlyPayment = loanAmount *monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears* 12));

       // mohaseba pardakht kol
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // nomaish natayeg
        System.out.printf("Monthly Payment: %.2f/n", monthlyPayment);
        System.out.printf("Total Payment: %.2f/n", totalPayment);

    }
}
