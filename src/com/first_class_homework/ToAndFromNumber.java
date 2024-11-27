package com.first_class_homework;

import java.util.Scanner;

public class ToAndFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fromNumber, toNumber;
        // Input the fromNumber and toNumber
        while (true) {
            System.out.print("Enter the fromNumber: ");
            fromNumber = sc.nextInt();
            System.out.print("Enter the toNumber: ");
            toNumber = sc.nextInt();
            if (toNumber >= 0 || fromNumber >= 0) {
                System.out.println("From number is:" + fromNumber);
                System.out.println("To number is:" + toNumber);
                if (fromNumber < toNumber) {
                    for (int i = fromNumber; i <= toNumber; i++) {
                        System.out.println("from to tonumber: " + i);
                    }
                } else {
                    int temp;
                    temp = toNumber;
                    toNumber = fromNumber;
                    fromNumber = temp;
                    for (int i = fromNumber; i <= toNumber; i++) {
                        System.out.println("from to after swapping value:" + i);
                    }
                }
                break;
            } else {
                System.out.println("Enter valid value again:");
            }
        }

    }
}
