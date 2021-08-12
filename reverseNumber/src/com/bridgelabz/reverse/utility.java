package com.bridgelabz.reverse;

public class utility {
    public static void revNum(int number) {
        int rem,rev=0;
        while(number>0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("the reverse of the number is "+rev);
    }
}
