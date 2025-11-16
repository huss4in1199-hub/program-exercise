

package com.mycompany.checkisbn10;

import java.util.Scanner;

public class CheckISBN10 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first 9 digits if an ISBN as integer");
        int num = input.nextInt();
        int d9 = num%10;
        num = num/10;
        int d8 = num%10;
        num = num/10;
        int d7 = num%10;
        num = num/10;
        int d6 = num%10;
        num = num/10;
        int d5 = num%10;
        num = num/10;
        int d4 = num%10;
        num = num/10;
        int d3 = num%10;
        num = num/10;
        int d2 = num%10;
        num = num/10;
        int d1 = num%10;
        
        double d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
 
        if(d10 == 10)
                System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");
        
                else   System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+(int)d10);

    }
}
