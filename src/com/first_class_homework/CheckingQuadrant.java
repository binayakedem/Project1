package com.first_class_homework;

import java.util.Scanner;

public class CheckingQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter x coordinates:");
        x=sc.nextInt();
        System.out.println("Enter y coordinates:");
        y=sc.nextInt();

       if(x>0&&y>0){
           System.out.println("First quadrant q1");
       } else if (x<0&&y>0) {
           System.out.println("Second quadrant q2");
       }else if (x<0&&y<0) {
           System.out.println("Third quadrant q3");
       }else if (x>0&&y<0) {
           System.out.println("Fourth quadrant q4");
       }
    }

    }

