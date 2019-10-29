package com.xsis.day03.nested;

import java.util.Scanner;

public class nest05 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = scan.nextInt();
        for (int i = 0; i <=n ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <n-2 ; i++) {
            System.out.print("* ");
            for (int j = 1; j <n-2 ; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
        }
    }
}
