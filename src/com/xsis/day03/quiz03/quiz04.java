package com.xsis.day03.quiz03;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
       int i=1;
       String tampil=" ";
        Scanner scan = new Scanner(System.in);
       while (i!=0){
           System.out.print("Masukkan nilai: ");
           i = scan.nextInt();
          if(i!=0){
              tampil +=i +" ";
          }
       }
        System.out.println(tampil);
    }
}
