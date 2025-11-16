

package com.mycompany.headsortails;

import java.util.Scanner;


public class HeadsOrTails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random()*2);
        
        System.out.println("Enter your guess  (Enter Zero for heads or One for tails)");
        int guess = input.nextInt();
        
        if(num==0 && num==guess)
            System.out.println("You guess correct it is heads");
        else if(num==1 && num==guess)
            System.out.println("You guess correct it is tails");
        else if(num==0 && guess==1)
            System.out.println("Sorry you guess wrong it is heads");
         else if(num==1 && guess==0)
            System.out.println("Sorry you guess wrong it is tails");
        
    

    }
}
