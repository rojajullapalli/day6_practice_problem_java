package com.bridgelabz.perfect;

public class utility {
    public static void numPerfect(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if( number%i == 0 ){
                sum+=i;
            }
        }
        System.out.println("the number is "+sum);
        if(number==sum)
            System.out.println("number is perfect number");
        else
            System.out.println("number is not a perfect number");
    }
}
