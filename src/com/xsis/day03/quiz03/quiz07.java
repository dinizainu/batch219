package com.xsis.day03.quiz03;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        String kalimat;
        int i=0, kata=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kalimat Anda: ");
        kalimat = scan.nextLine();
        while (i<kalimat.length()){
            if (kalimat.charAt(i)==' '){
                kata++;
            }
            i++;
        }
        System.out.println("Kalamiat yang Anda masukkan memiliki: "+kata+" kata");
    }
}
