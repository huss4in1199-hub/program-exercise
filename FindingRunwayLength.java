
package com.mycompany.findingrunwaylength;

import java.util.Scanner;


public class FindingRunwayLength {

    public static void main(String[] args) {


          Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number for velocity :");
        double velocity = input.nextDouble();
        
        System.out.println("Enter number for acceleration: ");
        double acceleration = input.nextDouble();
        
        
        double L = (velocity * velocity)/(2*acceleration);
        
        System.out.println("The minimum runway lenght for this airplane is =>\t" +L);
        
        


    }
}
