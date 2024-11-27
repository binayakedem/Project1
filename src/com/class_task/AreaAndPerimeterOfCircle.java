package com.class_task;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        variable declaration
        float radius;
//        taking input from the user

        System.out.println("Enter the radius of circle:");
        radius=sc.nextFloat();

//        calculate the perimeter of circle

        float perimeter=(float) (2*Math.PI*radius);

//        calculate the area of circle
        float area = (float) (Math.PI*radius*radius);

//        displaying
        System.out.println("Area of circle:"+area);
        System.out.println("Perimeter of circle:"+perimeter);



    }
}
