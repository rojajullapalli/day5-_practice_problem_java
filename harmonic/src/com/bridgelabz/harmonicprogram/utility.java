package com.bridgelabz.harmonicprogram;

public class utility {
    public static void harmoniccalculation(int n) {
        float harmonic = 1;

        // loop to apply the forumula
        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }
        System.out.println("harmonic number is " +harmonic);
    }
}
