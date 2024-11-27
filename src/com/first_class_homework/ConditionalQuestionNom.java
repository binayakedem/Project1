package com.first_class_homework;

import java.util.Scanner;

public class ConditionalQuestionNom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input;
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();

//        first quetion divisible by 2
        if(number%2==0){
            System.out.println("The give number is exactly divisible by 2");
        }else{
            System.out.println("The given number is not divisible by 2");
        }
//the  string length 5 to 10
        while (true) {
            System.out.print("Enter a string (length between 5 and 10): ");
            input = sc.nextLine();

            if (input.length() >= 5 && input.length() <= 10) {
                System.out.println("Valid string entered: " + input);
                break;
            } else {
                System.out.println("Invalid length! Try again.");
            }
        }
//        the string first letter should start from a, b  ro s or p
        while (true){
            System.out.println("Enter string , first letter should be a, b, s or p :");
            input=sc.nextLine();
            char val=input.charAt(0);
            if(val=='a'|| val=='A'||val=='b'|| val=='B'||val=='s'|| val=='S'||val=='p'|| val=='P'){
                System.out.println("You entered corect:"+input);
                break;
            }else {
                System.out.println("Invalid , try again");
            }
        }
//        the string should not contain x y and z
        while (true){
            System.out.println("Enter string , string should not contain x, y and z :");
            input=sc.nextLine();
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)!='x'|| input.charAt(i)!='y'||input.charAt(i)!='z'){
                    System.out.println("You entered corect:"+input);
                    break;
                }else {
                    System.out.println("Invalid , try again");
                }
            }
        }
//        the number should be between 2 and 4
    }
}
