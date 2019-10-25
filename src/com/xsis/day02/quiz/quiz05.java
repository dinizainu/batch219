package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        int number01, number02, number03, number04;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        number01 = scan.nextInt();
        System.out.print("Enter your second  number: ");
        number02 = scan.nextInt();
        System.out.print("Enter your third number: ");
        number03 = scan.nextInt();
        System.out.print("Enter your fourth number");
        number04 = scan.nextInt();
        if(number01<0 || number02<0 || number03<0 || number04<0){
            System.out.println("Among the given number, there is negative one");
        } else {
            System.out.println("All of your number are positive");
        }
    }
}
