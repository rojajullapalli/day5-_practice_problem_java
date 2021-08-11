package com.bridgelabz.harmonicprogram;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find the harmonic");
        int n=sc.nextInt();
        utility u1=new utility();
        u1.harmoniccalculation(n);
    }
}
