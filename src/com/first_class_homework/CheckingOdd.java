package com.first_class_homework;

import java.util.Scanner;

public class CheckingOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter ther  number to check odd or even:");
        num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("the given number is odd");
        }
    }
}