package com.bridgelabz.factor;

public class utilities {
    public static int isprime;
    public static void primefactor(int number) {
        int i, j,count=0;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                isprime = 1;
                for (j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        isprime = 0;
                    }
                }
                if (isprime == 1) {
                    System.out.println(i);
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}
