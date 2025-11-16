
package com.mycompany.calculatefutureinvestmentvalue;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {

    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);

        System.out.println("Whta is the InvestmentAmount");
        double InvestmentAmount = input.nextDouble();
        
        System.out.println("What is the AnnualInterestRate");
        double AnnualInterestRate = input.nextDouble();
        
        System.out.println("How many years do you want to save?");
        int numberOfYear = input.nextInt();
        
        double mounthlyInterestRate = AnnualInterestRate/1200;
        
        
        double FutureInvestmentValue = InvestmentAmount*Math.pow(1+mounthlyInterestRate,numberOfYear*12);
        
        System.out.println("Future value is : "+FutureInvestmentValue);
        

    }
}
