package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        double suhu1, suhu2, suhu3, average;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperatur on first point: ");
        suhu1 = scan.nextDouble();
        System.out.print("Enter the temperature on second point: ");
        suhu2 = scan.nextDouble();
        System.out.print("Enter the temperature on third point: ");
        suhu3 = scan.nextDouble();
        average = (suhu1+suhu2+suhu3)/3;
        if(average>60){
            System.out.println("Heat Wave");
        } else {
            System.out.println("cold wave");
        }
    }
}
