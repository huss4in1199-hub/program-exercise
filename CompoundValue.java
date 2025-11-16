
package com.mycompany.compoundvalue;

import java.util.Scanner;

public class CompoundValue {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter your saving Amount");
        double savingAmount = input.nextDouble();
      
        double V1 = savingAmount*(1+0.00417);
        double V2 = (100+V1)*(1+0.00417);
        double V3 = (100+V2)*(1+0.00417);
        double V4 = (100+V3)*(1+0.00417);
        double V5 = (100+V4)*(1+0.00417);
        double V6 = (100+V5)*(1+0.00417);

        System.out.println("After the sixth month, the account value is = "+V6+"$");
    }
}
