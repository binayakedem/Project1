package com.first_class_homework;

import java.util.Scanner;

public class FeetToCenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height;
        System.out.println("Enter ther  number to height:");
        height = sc.nextFloat();
        float centimeters = (float) (height * 30.48);
        if (centimeters>160) {
            System.out.println("You are tall");
        } else {
            System.out.println("You are not tall.");
        }
    }
}
