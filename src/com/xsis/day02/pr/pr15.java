package com.xsis.day02.pr;

import java.util.Scanner;

public class pr15 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        String number, satuan = "", decimal = "";
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numer between 1.0 - 4.9");
        number = scan.next();
        if (number.matches(IS_NUMERIC)) {
            a = number.charAt(0);
            b = number.charAt(2);
            if (a < '5') {
                switch (a) {
                    case '1':
                        satuan = "one";
                        break;
                    case '2':
                        satuan = "two";
                        break;
                    case '3':
                        satuan = "three";
                        break;
                    case '4':
                        satuan = "four";
                        break;
                    default:
                        break;
                }
                switch (b) {
                    case '0':
                        decimal = "zero";
                        break;
                    case '1':
                        decimal = "one";
                        break;
                    case '2':
                        decimal = "two";
                        break;
                    case '3':
                        decimal = "three";
                        break;
                    case '4':
                        decimal = "four";
                        break;
                    case '5':
                        decimal = "five";
                        break;
                    case '6':
                        decimal = "six";
                        break;
                    case '7':
                        decimal = "seven";
                        break;
                    case 8:
                        decimal = "eight";
                        break;
                    case '9':
                        decimal = "nine";
                        break;
                    default:
                        break;
                }
                System.out.println(satuan + " point " + decimal);
            } else {
                System.out.println("Ops. Your number too large");
            }

        } else {
            System.out.println("Inputan Bukan bilangan numerik");
        }
    }
}
