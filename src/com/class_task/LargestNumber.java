package com.class_task;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber,secondNumber,thirdNumber;

//        taking input from user
        System.out.println("Enter first number");
        firstNumber=sc.nextInt();

        System.out.println("Enter second number");
        secondNumber=sc.nextInt();

        System.out.println("Enter third number");
        thirdNumber=sc.nextInt();

        if(firstNumber>secondNumber&&firstNumber>thirdNumber){

            System.out.println("Largest value is:"+firstNumber);

        } else if(secondNumber>firstNumber&&secondNumber>thirdNumber){

            System.out.println("Largest value is:"+secondNumber);

        }else {
            System.out.println("Largest value is:"+thirdNumber);
        }
    }
}
