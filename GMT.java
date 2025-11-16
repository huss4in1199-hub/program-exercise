
package com.mycompany.gmt;

public class GMT {

    private static long totalTimeMillis;

    public static void main(String[] args) {
        
   totalTimeMillis = System.currentTimeMillis();
        long totalSecond = totalTimeMillis/1000;
        long currentSecond = totalSecond%60;
        long totalMinute = totalSecond/60;
        long currentMinute = totalMinute%60;
        long totalHour = totalMinute/60;
        long currentHour = totalHour%24;
        System.out.println(currentHour+":"+currentMinute+":"+currentSecond+"GMT");
        System.out.println("localTime AF  "+(currentHour+4)+":"+(currentMinute+30)+":"+currentSecond+"GMT");
    
    }
}
