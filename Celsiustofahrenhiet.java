

package com.mycompany.celsiustofahrenhiet;

import java.util.Scanner;

public class Celsiustofahrenhiet {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter degree in celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenhiet = (celsius*9/5)+32;
        
        System.out.println(fahrenhiet+"degree");
        
    }
}
