package com.xsis.day01.pr;

import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        int number, display;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = scan.nextInt();
        display = number%2;
        System.out.println(display);
    }
}
