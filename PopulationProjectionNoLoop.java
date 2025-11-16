  
package com.mycompany.populationprojectionnoloop;

import java.util.Scanner;

public class PopulationProjectionNoLoop {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
        
        long initialPopulation = 50000L;
        
        int birthInterval = 7;
        int deathInterval = 13;
        int immigrantInterval = 45;
        int secondsPerYear = 365*24*60*60;
        
        System.out.println("Enter  number for years");
        int years = input.nextInt();
        
        long birthsPerYear = secondsPerYear / birthInterval;
        long deathsPerInterval = secondsPerYear / deathInterval;
        long immigrantsPerInterval = secondsPerYear / immigrantInterval;
        
        long population = initialPopulation + years*(birthsPerYear - deathsPerInterval + immigrantInterval);
        
        
        System.out.println("Population after"+years+ "years  =>\t"+population);
        
        
    }
}
