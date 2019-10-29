package com.xsis.day03.quiz03;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        int n, a;
        double sum = 0.0;
        double avg = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N number");
        n = scan.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter number: ");
            a = scan.nextInt();
            sum = sum+a;
            avg = sum/n;
        }
        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);
    }
}
