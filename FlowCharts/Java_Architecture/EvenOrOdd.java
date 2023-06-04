package com.practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num!=0 && num%2==0){
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is od33d");
        }
    }
}
