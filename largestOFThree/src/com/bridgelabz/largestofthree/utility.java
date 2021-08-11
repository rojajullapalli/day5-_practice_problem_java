package com.bridgelabz.largestofthree;

public class utility {
    public static void checkbig(int number1,int number2,int number3){
        if(number1>=number2 && number1>=number3)
            System.out.println("number "+number1+" is largest");
        else if (number2>=number1 && number2>=number3)
            System.out.println("number "+number2+" is largest");
        else
            System.out.println("number "+number3+" is largest");
    }
}
