
package com.mycompany.costofshipping;

import java.util.Scanner;

public class CostOfShipping {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        
        System.out.println("Enter  the weight of the package betwen (1 - 20)");
        double w = input.nextDouble();
        
        if(w<=0)
            System.out.println("Invalid input");
        else if (w>0 && w<=1)
            System.out.println("The price of the package is $3.5");
        else if(w>1 && w<=3)
            System.out.println("The price of the package is $5.5");
         else if(w>3 && w<=10)
            System.out.println("The price of the package is $8.5");
         else if(w>10 && w<=20)
            System.out.println("The price of the package is $10.5");
         else System.out.println("The package cannot be shipped");
    }
}
