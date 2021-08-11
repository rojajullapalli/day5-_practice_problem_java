package com.bridgelabz.quorem;

import java.util.Scanner;

public class QuoAndRem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dividend and divisor");
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        utility u1=new utility();
        u1.quotientRemainder(dividend,divisor);
    }
}
