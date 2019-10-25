package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        int number01, number02;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number01  = scan.nextInt();
        System.out.print("Enter second number:");
        number02 = scan.nextInt();
        if (number01>0 && number02>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative2");
        }
    }
}
