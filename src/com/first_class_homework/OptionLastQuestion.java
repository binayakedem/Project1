package com.first_class_homework;

import java.util.Scanner;

public class OptionLastQuestion {
    public static void main(String[] args) {
        int c=0, r=0, u=0, d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("0.EXIT");
        System.out.println("1.CREATE");
        System.out.println("2.READ");
        System.out.println("3.UPDATE");
        System.out.println("4.DELETE");
        int choice=1;
        while (choice!=0){
            System.out.println("Enter your choice:");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    c++;
                    System.out.println("You click create option "+c+" Times");
                    break;
                case 2:
                    r++;
                    System.out.println("You click Read option "+r+" Times");
                    break;
                case 3:
                    u++;
                    System.out.println("You click Update option "+u+" Times");
                    break;
                case 4:
                    d++;
                    System.out.println("You click Delete option "+d+" Times");
                    break;
                case 0:
                    System.out.println("You click 0, Exit");
                    break;
                default:
                    System.out.println("TRY AGAIN!");

            }
        }
    }
}
