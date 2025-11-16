
package com.mycompany.computechang;

import java.util.Scanner;

public class ComputeChang {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an amount in double, for example 11.91: ");
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount /100;
        remainingAmount = remainingAmount % 100;
        
        int numberOFQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        int numberOFDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        int numberOfPennies = remainingAmount;
        
        System.out.println("Your amount"+ amount + "consis of");
        System.out.println(""+ numberOfOneDollars + "Dollars");
        System.out.println(""+ numberOFQuarters + "Quarters");
        System.out.println(""+ numberOFDimes + "Dimes");
        System.out.println(""+ numberOfNickels + "Nickels");
        System.out.println(""+ numberOfPennies + "Pennies");



    }
}
