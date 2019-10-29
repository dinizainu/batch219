package com.xsis.day03.forloop;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        int number, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many loop: ");
        number=scan.nextInt();
        for (int j = 0; j <number ; j++) {
            System.out.println("j: "+j);
        }
    }
}
