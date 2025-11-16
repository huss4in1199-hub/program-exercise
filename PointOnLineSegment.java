package com.mycompany.pointonlinesegment;

import java.util.Scanner;

public class PointOnLineSegment {

    public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        float x0, x1, x2, y0, y1, y2;
        x0 = input.nextFloat();
        y0 = input.nextFloat();
        x1 = input.nextFloat();
        y1 = input.nextFloat();
        x2 = input.nextFloat();
        y2 = input.nextFloat();

        double value = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        
        if(value > 0)
            System.out.println("P2 is on the left side of the line");
        else if(value < 0)
            System.out.println("P2 is on the right side of the line");
        else if ((value == 0) && (x2>= Math.min(x0, x1) && x2<= Math.max(x0, x1) && y2>= Math.min(y0, y1) && y2<= Math.max(y0, y1)))
            System.out.println("P2 is on the line segment");
        else 
            System.out.println("P2 is not on the line segment");
    }
}
