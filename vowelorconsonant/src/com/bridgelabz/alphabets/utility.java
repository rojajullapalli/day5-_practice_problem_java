package com.bridgelabz.alphabets;

public class utility {
    public static void isvowel(char alphabet){
        if((alphabet>='a' && alphabet<='z') ||(alphabet>='A' && alphabet<='Z')) {
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
                System.out.println(alphabet + " is vowel");
            else
                System.out.println(alphabet + " is consonant");
        }
        else
            System.out.println("is not alphabet");
    }
}
