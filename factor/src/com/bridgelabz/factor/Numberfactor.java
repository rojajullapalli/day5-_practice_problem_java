package com.bridgelabz.factor;

import java.util.Scanner;

public class Numberfactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to get its factors");
        int number=sc.nextInt();
        utilities u1=new utilities();
        u1.primefactor(number);

    }
}
