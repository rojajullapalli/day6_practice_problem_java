package com.bridgelabz.watch;

public class Stopwatch {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("start time= " +startTime);

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("stoptime = " +stopTime);
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsed time is " +elapsedTime);
    }
}
