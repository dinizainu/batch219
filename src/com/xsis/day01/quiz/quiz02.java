package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz02 {
    static final int totalMatkul = 4;
    public static void main(String[] args) {
        double matkulSatu, matkulDua, matkulTiga, matkulEmpat, average;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai mata kuliah pertama: ");
        matkulSatu = scan.nextDouble();
        System.out.print("Masukkan nilai mata kuliah kedua: ");
        matkulDua = scan.nextDouble();
        System.out.print("Masukkan nilai mata kuliah ketiga: ");
        matkulTiga = scan.nextDouble();
        System.out.print("Masukkan nilai mata kuliah keempat: ");
        matkulEmpat = scan.nextDouble();
        average = (matkulSatu + matkulDua + matkulTiga + matkulEmpat)/totalMatkul;
        System.out.println("Jadi Nilai rata - ratanya adalah: "+average);
    }
}
