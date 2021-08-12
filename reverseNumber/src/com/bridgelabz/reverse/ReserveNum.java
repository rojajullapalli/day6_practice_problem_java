package com.bridgelabz.reverse;

import java.util.Scanner;

public class ReserveNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to get reverse of an number");
        int number=sc.nextInt();
        utility u1=new utility();
        u1.revNum(number);
    }
}
