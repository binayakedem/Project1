package com.first_class_homework;

import java.util.Scanner;
public class CheckingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter ther  number to check positive or negative:");
        num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("the given number is positive");
        } else {
            System.out.println("the given number is negative");
        }
    }

}