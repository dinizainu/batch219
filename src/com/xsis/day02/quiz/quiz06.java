package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = scan.nextInt();
        System.out.print("Enter second number: ");
        number2 = scan.nextInt();
        if(number1>number2){
            System.out.println("Your first number is: "+number2);
            System.out.println("Your second number is: "+number1);
        } else{
            System.out.println(number1);
            System.out.println(number2);
        }

    }
}
