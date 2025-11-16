

package com.mycompany.costofdriving;

import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {

 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the driving distance");
        double distance = input.nextDouble();
        
        System.out.println("Enter miles per gallon");
        double  MPG = input.nextDouble();
        
        System.out.println("Enter price per gallon");
        double  PPG = input.nextDouble();
        
        double cost = (distance/MPG) * PPG;
        
        
        System.out.println(cost);
        

    }
}
