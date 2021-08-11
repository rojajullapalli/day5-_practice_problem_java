package com.bridegelabz.leap;

public class utility {
    public static void numbercheck(int year){
        int sum=0,n;
        int count=0;
        int tempyear=year;
        while (tempyear>0) {
            n = tempyear % 10;
            sum = sum + n;
            tempyear = tempyear / 10;
            count++;
        }
        if(count==4)
            yearleap(year);
        else
            System.out.println("leap year should be four digits");


    }
    public static void yearleap(int year) {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

    }
}
