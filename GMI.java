

package com.mycompany.gmi;

import java.util.Scanner;

public class GMI {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        
         System.out.println("pleas enter the value");
         double BMI = input.nextDouble();
         
           if( BMI < 18.5)
             System.out.println("Under wight");
        else
           if (BMI<25&&BMI>=18.5) 
            System.out.println("Narmal");       
                
        else        
           if(32>BMI&&BMI>=25)
            System.out.println("over wight");
           if (BMI>30)
            System.out.println("Obase");
            
            
            
    }
    
    
    
}
