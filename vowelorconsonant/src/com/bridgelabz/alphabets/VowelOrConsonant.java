package com.bridgelabz.alphabets;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphated to check it is vowel or consonant");
        //char alphabet=br.readLine().charAt(0);;
        char alphabet = sc.next().charAt(0);
        utility u1=new utility();
        u1.isvowel(alphabet);

    }
}
