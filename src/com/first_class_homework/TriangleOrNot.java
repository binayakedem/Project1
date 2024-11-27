package com.first_class_homework;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter the angle of the first : ");
        double angle1 = sc.nextDouble();
        System.out.print("Enter the angle of  second : ");
        double angle2 = sc.nextDouble();
        System.out.print("Enter the angle of third : ");
        double angle3 = sc.nextDouble();

        // Check if the input forms a valid triangle
        if((angle2+angle1+angle3)==180){
            System.out.println("The given triangle is valid");
        } else  {
            System.out.println("The given triangle is not valid.");
        }
    }
}
