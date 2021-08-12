package com.bridgelabz.prime;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check it is prime or not");
        int number =sc.nextInt();
        utility u1=new utility();
        u1.checkPrime(number);
    }
}
