

package com.mycompany.comparecosts;

import java.util.Scanner;


public class CompareCosts {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter weight and price for package 1: ");
        float weight1 , price1;
        weight1 = input.nextFloat();
        price1 = input.nextFloat();
        float cost1 = price1/weight1;
        System.out.println("Enter weight and price for package 2: ");
        float weight2 , price2;
        weight2 = input.nextFloat();
        price2 = input.nextFloat();
        float cost2 = price2/weight2;
        
        if(cost1 < cost2)
            System.out.println("package 1 has a better price.");
         else if (cost2<cost1)
            System.out.println("package 2 has a better price.");
         else 
             System.out.println("Two package have the same price.");
    }
}
