package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz06 {
  //  static final int cons = 703;
    public static void main(String[] args) {
        double bmi, weight, height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan berat badan: ");
        weight = scan.nextDouble();
        System.out.println("Masukkan tinggi badan: ");
        height = scan.nextDouble();
        bmi = (weight)/(height*height);
        System.out.println("Nilai BMI Anda adalah: "+bmi);
    }
}
