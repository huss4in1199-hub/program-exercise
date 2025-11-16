

package com.mycompany.compoundvalueloop;

import java.util.Scanner;

public class CompoundValueLoop {

    public static void main(String[] args) {

        
                Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        
        double monthlyInterestRate = 0.05/12;
        
        int months = years * 12;
        
        double accountValue = monthlySaving * (Math.pow(1 + monthlyInterestRate, months ) - 1)/ monthlyInterestRate;

        System.out.println("After %d years, the account value is: %.2f\n"+accountValue);
    }
}
