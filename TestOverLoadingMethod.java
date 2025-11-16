
package com.mycompany.testoverloadingmethod;
import java.util.Scanner;

public class TestOverLoadingMethod {

    public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
        System.out.println("the maximum between 3 and 4 is "+ max(3,4) );
        System.out.println("the maximum between 56.4 and 65.4 is "+max(56.4, 65.4));

    }
   static int max(int num1, int num2){
       if(num1>num2)
            return num1;
       else 
           return num2;
   }
   static double max(double num1, double num2){
       if(num1>num2 )
           return num1;
       else 
           return num2;
   }
   static double max(double num1, double num2, double num3){
          return max(max(num1, num2),num3);
   }
}
