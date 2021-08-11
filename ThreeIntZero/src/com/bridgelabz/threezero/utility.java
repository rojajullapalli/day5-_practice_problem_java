package com.bridgelabz.threezero;

public class utility {
    public static void sumofzero(int array[]){
        int i,j,k;
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                for (k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Numbers found : " + array[i] + "," + array[j] + " and " + array[k]);
                    }
                }
            }
        }

    }
}
