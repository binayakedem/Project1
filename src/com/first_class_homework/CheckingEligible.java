package com.first_class_homework;

import java.util.Scanner;

public class CheckingEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter ther  number to check eligibility:");
        age = sc.nextInt();
        if (age >18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("tYou are not eligible to vote");
        }
    }
}
