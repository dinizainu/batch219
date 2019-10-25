package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scan.nextInt();
        if(number>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
