package com.first_class_homework;

import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter ther first number:");
        num1=sc.nextInt();
        System.out.println("Enter ther second number:");
        num2=sc.nextInt();
        if(num2==num1){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");
        }
    }
}
