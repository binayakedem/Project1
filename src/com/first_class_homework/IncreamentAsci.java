package com.first_class_homework;

import java.util.Scanner;
public class IncreamentAsci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";

        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result += (char) (ch + 1);
            } else {
                result += ch;
            }
        }
        System.out.println("Transformed string: " + result);

    }
}
