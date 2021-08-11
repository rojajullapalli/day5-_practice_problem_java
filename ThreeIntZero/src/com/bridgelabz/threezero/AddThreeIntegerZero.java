package com.bridgelabz.threezero;

import java.util.Scanner;

public class AddThreeIntegerZero {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        utility u1=new utility();
        u1.sumofzero(array);

    }
}
