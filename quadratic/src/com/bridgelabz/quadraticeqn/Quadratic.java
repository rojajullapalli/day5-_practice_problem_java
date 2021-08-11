package com.bridgelabz.quadraticeqn;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a,b,c to get roots of quadratic equation");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        utility u1=new utility();
        u1.getRoots(a,b,c);
    }
}
