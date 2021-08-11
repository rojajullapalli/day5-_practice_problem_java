package com.bridgelabz.oddeven;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check it is even or odd");
        int number=sc.nextInt();
        utility u1=new utility();
        u1.isoddeven(number);
    }
}
