package com.bridgelabz.largestofthree;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three values to check which number is biggest");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        utility u1=new utility();
        u1.checkbig(number1,number2,number3);

    }
}
