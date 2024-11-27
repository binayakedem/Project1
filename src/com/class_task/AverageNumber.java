package com.class_task;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration

        int firstNumber, secondNumber, thirdNumber;

//        taking input from user
        System.out.println("Enter first number:");
        firstNumber = sc.nextInt();

        System.out.println("Enter second number:");
        secondNumber = sc.nextInt();

        System.out.println("Enter third number:");
        thirdNumber = sc.nextInt();

//        displaying average number
        System.out.println("Average number is:"+((firstNumber+secondNumber+thirdNumber)/3));

    }
}
