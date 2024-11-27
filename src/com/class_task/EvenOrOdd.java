package com.class_task;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
//taking input from user

        System.out.println("Enter the value to check whether it is odd or even:");
        num = sc.nextInt();
//checking whether the number is odd or even
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        }else{
            System.out.println(num+" is odd.");
        }


    }
}
