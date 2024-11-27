package com.class_task;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
//     take user input and display the hello+name
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name=sc.nextLine();
        System.out.println("Hello! "+name);

    }
}
