package com.bridgelabz.wind;

import java.util.Scanner;

public class Windchill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature t (in Fahrenheit) and the wind speed v (in miles per hour)");
        double t= sc.nextDouble();
        int v=sc.nextInt();
        calWindChill(t,v);
    }

    private static void calWindChill(double t, int v) {
        double windchill;
        if(t<=50 && (v>=3 && v<120)){
           double power=Math.pow(v,0.16);
            windchill=35.74+0.6215*t-35.75*power+0.4275*t*power;
            System.out.println("windchill is"+windchill);
        }
        else
            System.out.println("the formula is not valid if t is larger than 50 in absolute value or if v is larger\n" +
                    "than 120 or less than 3 (you may assume that the values you get are in that range).");
    }
}
