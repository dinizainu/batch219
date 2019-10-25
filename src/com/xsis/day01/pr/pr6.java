package com.xsis.day01.pr;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        int money, $20, $10, $5, $1, residu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your money: ");
        money = scan.nextInt();
        $20 = money/20;
        residu = money%20;
        $10 = residu/10;
        residu = residu%10;
        $5 = residu/5;
        residu = residu%5;
        $1 = residu;
        residu = residu%1;
        System.out.println($20+" note of $20 "+$10+" note of $10 "+$5+" note of $5 "+$1+" note of $1");
    }
}
