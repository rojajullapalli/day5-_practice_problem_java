package com.bridgelabz.quorem;

public class utility {
    public static void quotientRemainder(int dividend,int divisor){
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
