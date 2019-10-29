package com.xsis.day03;

import java.util.Scanner;

public class while06 {
    public static void main(String[] args) {
        int sum, i, a;
        sum = 0;
        i = 1;
        Scanner scan = new Scanner(System.in);
        while (i<=5){
            System.out.println("Masukkan bilangan: ");
            a = scan.nextInt();
            if(a%2==0){
                sum = sum + a;
            }
            i++;
        }
        System.out.println("sum: "+sum);
    }
}
