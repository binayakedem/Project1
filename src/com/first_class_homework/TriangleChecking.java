package com.first_class_homework;
import java.util.Scanner;
public class TriangleChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter the length of the first side: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double side3 = sc.nextDouble();

        // Check if the input forms a valid triangle
       if(side2==side1 && side1==side3){
           System.out.println("The given triangle is equilateral");
       } else if (side2==side1 || side1==side3 ||side2==side3) {
           System.out.println("The given triangle is isosceles.");
       }else {
           System.out.println("The given triangle is scalene");
        }

    }
}
