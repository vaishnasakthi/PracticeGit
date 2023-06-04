package com.practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Please enter armstrong number :");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int  cubeOfDigits =0;
        int temp= number;
        int remainder =0;
        while(temp>0){
            remainder  = temp%10;
           cubeOfDigits +=  Math.pow(remainder,3);
           temp = temp/10;
        }
        if(cubeOfDigits==number){
            System.out.println("Entered number is an armstrong number");
        } else {
            System.out.println("Entered number is not an armstrong number");
        }
    }
}
