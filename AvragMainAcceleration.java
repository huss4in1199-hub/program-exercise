

package com.mycompany.avragmainacceleration;

import java.util.Scanner;

public class AvragMainAcceleration {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for velocity Vo: ");
        double Vo = input.nextDouble();
        
        System.out.println("Enter a number for velocity V: ");
        double V = input.nextDouble();
        
                System.out.println("Enter a number for time: ");
        double t = input.nextDouble();
        
        double a = (V-Vo)/t;
        
        System.out.println("Avrage Acceleraton = " +a);

    }
}
