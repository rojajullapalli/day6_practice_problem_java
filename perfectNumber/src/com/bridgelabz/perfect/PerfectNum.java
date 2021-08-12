package com.bridgelabz.perfect;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check number is perfect number or not");
        int number=sc.nextInt();
        utility u1=new utility();
        u1.numPerfect(number);
    }
}
