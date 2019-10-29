package com.xsis.day03;

import java.util.Scanner;

public class while05 {
    public static void main(String[] args) {
        double p = 1, a;
        int i;
        Scanner scan = new Scanner(System.in);
        i = 1;
        while (i<5){
            System.out.println("input number: ");
            a = scan.nextDouble();
            p = p*a;
            i++;
        }
        System.out.println("p: "+p);
    }
}
