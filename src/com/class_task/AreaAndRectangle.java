package com.class_task;

import java.util.Scanner;

public class AreaAndRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lengthOfRectangle;
        float breadthOfRectangle;
//        taking input from user as length and breadth
        System.out.println("Enter the length fo rectangle:");
        lengthOfRectangle = sc.nextFloat();

        System.out.println("Enter the breadth of rectangle:");
        breadthOfRectangle = sc.nextFloat();

//        area of rectangle is
        System.out.println("Area of rectangle is :"+(lengthOfRectangle*breadthOfRectangle));

//        perimeter of rectangle is
        System.out.println("Perimeter of rectangle is :"+(2*(lengthOfRectangle+breadthOfRectangle)));
    }
}
