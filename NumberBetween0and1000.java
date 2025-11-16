

package com.mycompany.numberbetween0and1000;

import java.util.Scanner;

public class NumberBetween0and1000 {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number between 0 and 1000");
        int number = input.nextInt();
        
        
        int sum = (number / 100)+ (number /10 % 10)+ (number%10);
        
        System.out.println("Sum of digits = " +sum);
        

        
        
    }
}
