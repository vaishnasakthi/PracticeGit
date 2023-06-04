package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println("Please enter your name :");
        Scanner input= new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Greeting, welcome "+name);
    }
}
