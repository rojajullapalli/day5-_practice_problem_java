package com.bridgelabz.distance;

public class utility {
    public static void distancecalc(int x,int y){
        double distance;
        distance=Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
        System.out.println("distance is" +distance);
    }
}
