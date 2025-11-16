package com.mycompany.myprogrampractices;

import java.util.Scanner;

public class Myprogrampractices {

    private static long totalTimeMillis;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //  Assign a and b befor swap
        int i = 7 ;
        int j = 9;
 // use math for swap 
        j = j+i;
        i = j-i;      
        j = j-i;   
    System.out.println("i="+i);
    System.out.println("j="+j);
 
        
 // this is program for finding x
       int a = 1;
       int b = -4;
       int c = 3; 
   
// finding X1 and X2
      double x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
      double x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a; 
    
    System.out.println("x1="+x1);
    System.out.println("x2="+x2);
        
// this is program to campute simpleInterest  
    
      double principal = 1000;
      double rate = 200;
      double time = 3;
     
      double simpleInterest = (principal+rate+time)/100;
    
    System.out.println("the value of simpleInterest =" +simpleInterest);
     
//  fourthe program. in this program we show a number is even or odd 
 
       int number = 23;
       if ( number%2==0){
    System.out.println("even");
 }else{
    System.out.println("odd");
        }

// this is program that shows GMT and local AF Time
        
   totalTimeMillis = System.currentTimeMillis();
        long totalSecond = totalTimeMillis/1000;
        long currentSecond = totalSecond%60;
        long totalMinute = totalSecond/60;
        long currentMinute = totalMinute%60;
        long totalHour = totalMinute/60;
        long currentHour = totalHour%24;
        System.out.println(currentHour+":"+currentMinute+":"+currentSecond+"GMT");
        System.out.println("localTime AF  "+(currentHour+4)+":"+(currentMinute+30)+":"+currentSecond+"GMT");

 //this is program that campute area of circle area of rectingle
        double radius;
        double area ;
 // Assign radius
        radius = 40;
// campute area
       area =(3.14*radius*radius);
//  area of rectingle = high * low
        int high = 20;
        int low = 16;
        double areaOfRectingle ;
// campute area of rectingle 
        areaOfRectingle = high * low ;
        
        System.out.println("area of Rectingle ="+ areaOfRectingle);

// BMI         
         System.out.println("pleas enter the value");
         double BMI = input.nextDouble();
         
           if( BMI < 18.5)
             System.out.println("Under wight");
        else
           if (BMI<25) 
            System.out.println("Narmal");       
                
        else        
           if(32>BMI)
            System.out.println("over wight");
           if (BMI>30)
            System.out.println("Obase");
         
        // lattry game
       byte lattry = (byte)(Math.random()*100);
        System.out.println("pleas enter a two digit number");
        int gusse = input.nextInt();
        
        int L1 = (lattry/10);
        int L2 =(lattry%10);
        
        int g1 = gusse /10 ;
        int g2 =gusse %10;
        if (gusse == lattry ) {
            System.out.println("you are winning 10000$");
        }
        else if (L1 == g2 && L2 ==g1){
            System.out.println("your winning 3000$");
        }
        else if (L1 == g1 || L1==g2 || L2 ==g1 || L2 ==g2){
            System.out.println("yourwinning 1000$");
        }
        else { 
            System.out.println("your not winnig anything");
        }
        System.out.println("the corect digit is "+lattry);
        
        
        
        
        // finding the birth years   
            
        System.out.println("enter the year");
              int theYear = input.nextInt();
     
     switch ( theYear%12) {
         
        case 0: System.out.println("Monkey");break;
     
     
    
        case 1: System.out.println("Rooster");break;
      
    
        case 2:System.out.println("Dog");break;
  
    
        case 3: System.out.println("Pig"); break;
     
    
        case 4:System.out.println("Rat");break;
      
       
        case 5:System.out.println("Ox");break;
      
      
        case 6: System.out.println("Tiger"); break;
      
     
        case 7:System.out.println("Rabbit");break;
      
        case 8:System.out.println("Dragon"); break;
      
        
     
        case 9:
        System.out.println("Snake");
        break;
        
    
        case 10:
        System.out.println("Horse");
        break;
        
  
        case 11:
        System.out.println("Sheep");
        break;
default:
    // Lattry 
       byte lattry2 = (byte)(Math.random()*100);
        System.out.println("pleas enter a two digit number");
        int gusse2 = input.nextInt();
        
        int Ll1 = (lattry2/10);
        int Ll2 =(lattry2%10);
        
        int Gg1 = gusse2 /10 ;
        int Gg2 =gusse2 %10;
        if (gusse == lattry ) {
            System.out.println("you are winning 10000$");
        }
        else if (L1 == g2 && L2 ==g1){
            System.out.println("your winning 3000$");
        }
        else if (L1 == g1 || L1==g2 || L2 ==g1 || L2 ==g2){
            System.out.println("yourwinning 1000$");
        }
        else { 
            System.out.println("your not winnig anything");
        }
        System.out.println("the corect digit is "+lattry);
        
        
           }
     // order two cities name 
        System.out.println("Enter the first city : ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city : ");
        String city2 = input.nextLine();
        
        if(city1.compareTo(city2)<0){
            System.out.println("The cities in alphabical order are "+city1+"..."+city2);
        }
        else{
            System.out.println("The cities in alphabical order are "+city2+"..."+city1);
            
        }
// substring test
         
     String message = "Welcome to Java";
     message = message.substring(0,11) + "c++";
        System.out.println(message);
        
        
 // GuessBirthday method  
    String set1 = " 1 3 5 7\n"+
                  "9 11 13 15\n"+
                  "17 19 21 23\n"+
                  "25 27 29 31";
    
    String set2 = "2 3 6 7\n"+
                  "10 11 14 15\n"+
                  "18 19 22 23\n"+
                  "26 27 30 31\n";
    
    String set3 = "4 5 6 7\n"+
                  "12 13 14 15\n"+
                  "20 21 22 23\n"+
                  " 28 29 30 31\n";
    
    String set4 = "8 9 10 11\n"+
                  "12 13 14 15\n"+
                  "24 25 26 27\n"+
                  "28 29 30 31";
    
    String set5 = "16 17 18 19\n"+
                  "20 21 22 23\n"+
                  "24 25 26 27\n"+
                  "28 29 30 31\n";
    int day = 0;
    // prompt the user to answer questions
         System.out.println(" is your birthday in set1 ?\n");
          System.out.println(set1);
           System.out.println("\nEnter 0 for no and 1 for yes:");
    int answer = input.nextInt();
        
    if(answer ==1)
        day +=1;
        
         System.out.println(" is your birthday in set2 ?\n");
          System.out.println(set2);
           System.out.println("\nEnter 0 for no and 1 for yes:");
    answer = input.nextInt();
        
    if(answer ==1)
            day +=2;
        
         System.out.println(" is your birthday in set3 ?\n");
          System.out.println(set3);
           System.out.println("\nEnter 0 for no and 1 for yes:");
    answer = input.nextInt();
        
    if(answer ==1)
            day +=4;
        
         System.out.println(" is your birthday in set4 ?\n");
          System.out.println(set4);
           System.out.println("\nEnter 0 for no and 1 for yes:");
    answer = input.nextInt();
        
    if(answer ==1)
            day +=8;
        
         System.out.println(" is your birthday in set5 ?\n");
          System.out.println(set5);
           System.out.println("\nEnter 0 for no and 1 for yes:");
    answer = input.nextInt();
        
    if(answer ==1)
            day +=16;
         System.out.println("\nYour birthday is "+ day + "!");
         
         

//  Repeat addition quise
   int num1 = (int)(Math.random()*10);
   int num2 = (int)(Math.random()*10);
   
        System.out.println("What is "+num1+"+"+num2+" = ? ");
   int answer1 = input.nextInt();
   while (num1+num2 != answer1) {
       System.out.println("the answer is wrong what is"+num1+"and"+num2+"?" );
       answer1 = input.nextInt();
   }    
        System.out.println("You got it");
        
        
//  Gussing Number
    int Rnumber = (int)(Math.random()*101);
        System.out.println("Guss a magic number between 0 and 100");
    int guss = 0;
    while(guss!=Rnumber){
        
        System.out.print("\n Enter your gussess:");
       guss = input.nextInt();
    if(guss==Rnumber)    
            System.out.println("Yes the number is "+ Rnumber);
    else if(guss>Rnumber)
            System.out.println("your guss is too high");
    else if (guss<Rnumber)
            System.out.println("you guss is too low");
       }
    
    
    
   // Subractionloop;
   final int ADDITON_COUNT_NUMBER = 5;
   int correctCount = 0;
   int count = 0;
   long startTime = System.currentTimeMillis();
   String output = "";
    
   while (count<ADDITON_COUNT_NUMBER){
    // creat two random number
    int number1 = (int)(Math.random()*10);
    int number2 = (int)(Math.random()*10);
    // if number1 < number2 swap number1 and number2
    if (number1<number2){
     int temp = number1;
     number1=number2;
     number2=temp;
    }
    
    
    // prompt student to answer what is number1 - number2
       System.out.print("What is " +number1+" - "+number2+" ? "); 
       int answer2 = input.nextInt();
       if (number1-number2==answer2){
           System.out.println("You are corect ");
           correctCount++;
       }
       else
           System.out.println("your answer is wrong.\n" + number1+"-"+number2+" should be "+(number1-number2));
         count++;
   output += "\n"+number1+"-"+number2+" = "+answer2+
           ((number1 - number2==answer2)? " correct ":" false ");

   }
 long endTime=System.currentTimeMillis();
 long testTime = endTime - startTime;
        System.out.println("Correct Count is "+correctCount+"\ntestTime is "+testTime/1000 +" second\n "+output);
   
        
        
// Sentinal value

// read an initial data
System.out.println("Enter a value(the input ends if it is 0): ");
 int data = input.nextInt();
 int sum = 0;
 while(data!=0){
     sum+=data;
     System.out.println("Enter an Enteger(the input ends if it is 0:)");
     data = input.nextInt();
 }
        System.out.println("The sum is "+sum);
 
        int dataDo; int sumDo = 0;
        do{ 
            System.out.println("Enter an Enteger(the input ends if it is 0:)");
         dataDo = input.nextInt();
         sumDo+=dataDo;
         
        }while(dataDo!=0);
        System.out.println("the sum is "+sumDo);
        
        
      // Greatest common divisor
        System.out.println("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n2 = input.nextInt();
         
        int gcd = 1; int k = 2;
while (k<=n1&&k<=n2){
    if(n1%k==0&&n2%k==0)
        gcd = k;
    k++;
}        
        System.out.println("The greatest common divisor for "+n1 +" and "+n2+" is "+gcd);
        
        
        
// Multiplication table
        System.out.println("Multiplication Table");
        System.out.println("      ");
         for(int g = 1; g<=9; g++)
    System.out.print("    " + g);
        System.out.println("\n--------------------------------------");
    for (int x=1; x<=9; x++){
        System.out.print(x +" | ");
           for(int y=1; y<=9; y++){
        System.out.printf(" %4d", x * y);
            }
          System.out.println(); 
     }
    
    
    
 // Test Break
 int sumB =0;int numberB =0;//sumB beacuse there is another sum and also numberB
 while(numberB < 20){
     numberB++;
     sumB+=numberB;
     if(sumB>=100)
         break;
     
 }
        System.out.println("the number is "+numberB);
        System.out.println("the sum is "+sumB);
        
        
        
 // Test continue
 int sumC=0;
 int numberC=0;
 while(numberC<20){
     numberC++;
     if(numberC==10||numberC==11)
         continue;
     sumC+=numberC;
 }
        System.out.println("the sum is "+sumC);
        
        
        

 // sum from 1-10 , 20-37 and 35-49
 int sum2=0;
 for(int l=1; l<=10; l++)
     sum2 +=l;
 for(int l=20; l<=37; l++)
     sum2+=l;
 for(int l=35; l<49; l++)
     sum2 += l;
        System.out.println("the sum is "+sum2);
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        System.out.println("Sum from 35 to 47 is " + sum(35, 47));
        
        
        
        
// Finding max beween two number by using mithod
System.out.println("Enter the enteger 1 ");
      double input1 = input.nextDouble();
        
        System.out.println("Enter the enteger 2 ");
        double input2 = input.nextDouble();
        
        System.out.println("The maximam between "+input1+ " and "+input2+" is "+Max(input1, input2));
    }

    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++) {
            result += i;
        }

        return result;
    }
   static double Max(double i, double j) {
       double result;
        if (i>j)
            result=i;
        else
            result=j;
        return result;
    }
}
