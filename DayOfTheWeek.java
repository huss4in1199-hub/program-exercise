

package com.mycompany.dayoftheweek;

import java.util.Scanner;


public class DayOfTheWeek {

    public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
        
        System.out.println("Enter year");
        int year = input.nextInt();
        System.out.println("Enter month  1-12");
        int m = input.nextInt();
        System.out.println("Enter the day of the month  1-31");
        int q = input.nextInt();
        
        int k = year%100;
        int j = year/100;
        
        if (m==1){
        m = 13; k = k-1;
        }else if(m == 2){
        m = 14; k = k-1;
        }
        
        int h =(q + (26*(m+1))/10 + k + k/4 + j/4 + 5*j)%7;
        
        switch (h){
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;

        
        
        }
    }
}
