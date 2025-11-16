
package com.mycompany.gamascissorrockpaper;

import java.util.Scanner;

public class GamaScissorRockPaper {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
      
       int a =(int)(Math.random()*3);
        
        System.out.println("Enter a number betwen (0 - 2):  0 = paper , 1 = scissor , 2 = rock");
        int b = input.nextInt();
        
        if(a==0 && b==0)
            System.out.println("The computer is paper, You are also paper ,Both are you the same");
        else if (a==0 && b==1)
            System.out.println("The computer is paper, You are scissor, You won");
        else if (a==0 && b==2)
            System.out.println("The computer is paper, You are rock, You loss");
        else if (a==1 && b==0)
            System.out.println("The computer is scissor, You are paper, You loss");
        else if (a==1 && b==1)
            System.out.println("The computer is scissor, You are also scissor ,Both are you the same");
          else if (a==1 && b==2)
            System.out.println("The computer is scissor, You are rock, You won");
          else if (a==2 && b==0)
            System.out.println("The computer is rock, You are paper, You won");
          else if (a==2 && b==1)
            System.out.println("The computer is rock, You are scissor, You loss");
          else if (a==2 && b==2)
            System.out.println("The computer is rock, You are also rock, Both are you the same");
    }
}
