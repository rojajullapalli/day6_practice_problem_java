package com.bridgelabz.fib;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to generate fibonacci series");
        int number=sc.nextInt();
        utility u1=new utility();
        u1.fibonacciSeries(number);
    }
}
