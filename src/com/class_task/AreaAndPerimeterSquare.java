package com.class_task;

import java.util.Scanner;

public class AreaAndPerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration
        float length;
        System.out.println("Enter the length of square:");
        length=sc.nextFloat();

//        displaying data
        System.out.println("Area square is:"+(length*length));

//        perimeter of square
        System.out.println("Perimeter of square is:"+(4*length));
    }
}
