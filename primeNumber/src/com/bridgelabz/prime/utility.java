package com.bridgelabz.prime;

public class utility {
    public static void checkPrime(int number) {
        int count=0;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}
