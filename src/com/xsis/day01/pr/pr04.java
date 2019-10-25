package com.xsis.day01.pr;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        int number, display;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number = scan.nextInt();
        display = (number+1)%2;
        System.out.println(display);
    }
}
