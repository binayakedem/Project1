package com.company_name.sms.userio.userio;

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstNumber=sc.nextInt();
        System.out.println("Enter the second number:");
        secondNumber=sc.nextInt();
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
