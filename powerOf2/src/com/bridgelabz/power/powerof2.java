package com.bridgelabz.power;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range to print table");
        int n= sc.nextInt();
        utility u1=new utility();
        u1.poweroftwo(n);
    }
}
