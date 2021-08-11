package com.bridegelabz.leap;

import java.util.Scanner;

public class Leapyearornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year to check leap year or not");
        int year=sc.nextInt();
        utility u1= new utility();
        u1.numbercheck(year);
    }

}
