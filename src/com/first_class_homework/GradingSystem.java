package com.first_class_homework;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store marks for 5 subjects
        int[] marks = new int[5];
        int total = 0;

        // Input marks for 5 subjects
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0-100): ");
                int mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    total += mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }
        }


        System.out.println("\nTotal Marks: " + total);

        // Calculate and display grade
        String grade;
        if (total >= 450) {
            grade = "A+";
        } else if (total >= 400) {
            grade = "A";
        } else if (total >= 350) {
            grade = "B+";
        } else if (total >= 300) {
            grade = "B";
        } else if (total >= 250) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

    }
}
