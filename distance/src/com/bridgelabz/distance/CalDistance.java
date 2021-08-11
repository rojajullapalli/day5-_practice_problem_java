package com.bridgelabz.distance;

import java.util.Scanner;

public class CalDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the co-ordinates of x and y");
        int x=sc.nextInt();
        int y= sc.nextInt();
        utility u1=new utility();
        u1.distancecalc(x,y);
    }
}
