

package com.mycompany.computetaxadvanced;

import java.util.Scanner;

public class ComputeTaxAdvanced {

    public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

          final int status = 0;
        
        System.out.println("Enter your incoming");
        double income = input.nextDouble();
        
        double tax;
        
        if(status == 0 && income <=8350)
            tax = income * 0.10;
        else if(status == 0 && income <=33950)
            tax = 8350*0.10 + (income-8350)*0.15;
                else if(status == 0 && income <=82250)
            tax = 8350*0.10 + (33950-8350)*0.15+(income-33950)*0.25;
          else if(status == 0 && income <=171550)
            tax = 8350*0.10 + (33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28;
         else if(status == 0 && income <=372950)
            tax = 8350*0.10 + (33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(income-171550)*0.33;
         else if(status==0){
                         tax = 8350*0.10 + (33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;

        System.out.println("tax is = "+tax);}
    }
}
