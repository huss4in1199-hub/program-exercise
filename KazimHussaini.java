
package com.mycompany.kazimhussaini;

import java.util.Scanner;

public class KazimHussaini {

    public static void main(String[] args) {
  /*    
     String person[][] = {
         {"Ali"," Hussaini","1","IT"},
         {"Maryam","Moradi","2","IS"},
         {"Zainab","Rahimi","3","IT"},
         {"Baqir","Mohsini","4","ES"}
     };
for(int x=0; x<person.length; x++) {
    for(int y=0; y<person.length; y++){
        System.out.print(person[x][y] + " ");
    }
    System.out.println("");
}       */
        
// Salary Paymant System
     Scanner s = new Scanner(System.in);
  
     System.out.println("please enter number of employee: ");
     int lenght = s.nextInt();
     String[] employee = new String[lenght]; 
     int[] salary = new int[lenght];
  
     for(int x=0; x<lenght; x++){
         System.out.println("Please enter employee's name: ");
         employee[x] = s.next();
         System.out.print("Please enter "+ employee[x]+" salary: " );
         salary[x] = s.nextInt();
     }
     int i =0;
     for(String e : employee){
         System.out.print(e + " , "+salary[i] +"\n");
         i++;
     }
     
     
    }
}
