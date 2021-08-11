package com.bridgelabz.quadraticeqn;

public class utility {
    public static void getRoots(float a,float b,float c){
        double delta=Math.pow(b,2)-(4*a*c);
        System.out.println("delta is "+delta);
        double root1_of_x=(-b + Math.sqrt(delta))/(2*a);
        double root2_of_x=(-b - Math.sqrt(delta))/(2*a);
        System.out.println("root1 of x is "+root1_of_x);
        System.out.println("root2 of x is "+root2_of_x);

    }
}
