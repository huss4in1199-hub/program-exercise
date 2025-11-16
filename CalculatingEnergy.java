
package com.mycompany.calculatingenergy;

import java.util.Scanner;


public class CalculatingEnergy {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        System.out.println("How much water do you have?");
        Double M = input.nextDouble();
        
        System.out.println("What is the initial temperature of the water?");
        double T_initial = input.nextDouble();
        
                System.out.println("What is the final temperature of the water?");
        double T_final = input.nextDouble();
         
        
        double Q = M*(T_final-T_initial)*4184;
        
        System.out.println("The energy needed is =" + Q + "J");
        
    }
}
