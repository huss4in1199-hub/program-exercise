
package com.mycompany.exerciseprogrammingseason2;
import java.util.Scanner;
public class ExerciseProgrammingSeason2 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
        System.out.println(" enter a degree in celciuss ");//2.1
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0/5) * celcius + 32 ;
        System.out.println(celcius + " celciusn is " + fahrenheit+ " fahrenheit");
   
       // 2.2 
       final double PI = 3.14;
        System.out.println("Enter the radius and length of a cylinder ");
         double radius = input.nextDouble();   
         double length = input.nextDouble();
         double area = radius * radius * PI;
         double volume = area * length;
         
         System.out.println("The area is "+ area);
         System.out.println("The volme is "+ volume);
         
         // 2.3
         System.out.println("Enter a number in feet : ");
          double feet = input.nextDouble();
          double meters = feet * 0.305 ;
          System.out.println( feet+  "feet is " + meters + "meters");
          
    
    }
}
