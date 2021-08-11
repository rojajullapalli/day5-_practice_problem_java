package com.bridgelabz.swap;

public class utilitie {
    public static void swap(int number1,int number2){
        System.out.println("number before swapping");
        System.out.println("number1 " +number1);
        System.out.println("number2 " +number2);
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("number after swapping");
        System.out.println("number1 is"+number1);
        System.out.println("number2 is"+number2);

    }
}
