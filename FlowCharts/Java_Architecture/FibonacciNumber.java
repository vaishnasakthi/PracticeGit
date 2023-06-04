package com.practice;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a =1;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        while(c<=num){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
