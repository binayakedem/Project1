package com.class_task;

import java.util.Scanner;

public class EquilaterOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration
        float firstSide, secondSide, thirdSide;

//        input from user to check whether the triangle is equilateral or not
        System.out.println("Enter the first side:");
        firstSide = sc.nextFloat();

        System.out.println("Enter the second side:");
        secondSide = sc.nextFloat();

        System.out.println("Enter the third side:");
        thirdSide = sc.nextFloat();

//        condition checking here
        if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.println("The triangle is equilateral.");
        } else {
            System.out.println("The given triangle is not equilateral.");
        }

    }
}
