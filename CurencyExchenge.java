

package com.mycompany.curencyexchenge;

import java.util.Scanner;

public class CurencyExchenge {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

               System.out.print("Enter the exchange rate from dollars to RMB: ");
               double a = input.nextDouble();
               System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
               byte b = input.nextByte();
               if(b==0){
                   System.out.print("Enter the dollars amount: ");
               double dollars = input.nextDouble();
               
               double yuan = a*dollars;
               System.out.println(dollars+"$ is "+yuan+" yuan");}
               else if (b==1){
                   System.out.print("Enter the RMB amount: ");
               double yuan = input.nextDouble();
               double dollars = yuan/a;
                   System.out.println(yuan+" yuan is $"+dollars);
                   
               }
    }
}
