package com.class_task;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber, secondNumber;

//user input
        System.out.println("Enter first number");
        firstNumber=sc.nextInt();
        System.out.println("Enter Second number");
        secondNumber=sc.nextInt();

//        d
        //displaying the sum of two numbers
        System.out.println("Sum of two numbers:"+(firstNumber+secondNumber));

        //product of two numbers are
        System.out.println("Product of two numbers:"+(firstNumber*secondNumber));

        //difference in two numbers
        System.out.println("Difference of two numbers:"+(firstNumber-secondNumber));

        //division of two numbers are
        System.out.println("Division of two numbers:"+(firstNumber/secondNumber));

        //reminder of two numbers are
        System.out.println("Reminder of two numbers:"+(firstNumber%secondNumber));

    }
}
