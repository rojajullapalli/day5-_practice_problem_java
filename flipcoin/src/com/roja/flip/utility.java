package com.roja.flip;

public class utility {
    public static void flip(int times ){
        int head=0,tail=0;
        for(int i=0;i<times;i++){
            double flip=Math.random();
            System.out.println(flip);
            if(flip>=0) {
                if (flip >= 0.5) {
                    System.out.println("head");
                    head = head + 1;
                }
                else{
                    System.out.println("tail");
                    tail = tail + 1;
                }
            }
        }
        System.out.println("the number of times head is " +head);
        System.out.println("the number of times tail is " +tail);
        float headpercentage=(( (float)head/times)*100);
        float tailpercentage=(( (float)tail/times)*100);
        System.out.println("headpercentage is "+headpercentage);
        System.out.println("tailpercentage is "+tailpercentage);
    }

    public static void main(String[] args) {
        System.out.println("you are in utility class go and run in flipcoin");
    }
}
