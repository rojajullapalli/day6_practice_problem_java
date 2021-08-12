package com.bridgelabz.fib;

public class utility {
    public static void fibonacciSeries(int number) {
        int term1=0,term2=1;
        int term3;
        System.out.println("fibonacci series is " +term1+"\nfibonacci series is "+term2);
        for(int i=2;i<number;i++){
            term3=term1+term2;
            term1=term2;
            term2=term3;
            System.out.println("fibonacci series is " +term3);
        }
    }

}
