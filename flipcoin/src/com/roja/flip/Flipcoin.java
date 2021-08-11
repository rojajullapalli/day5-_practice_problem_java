package com.roja.flip;

import java.util.Scanner;
public class Flipcoin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of times has coin to be flipped");
        int times=sc.nextInt();
        utility u1=new utility();
        u1.flip(times);
    }
}