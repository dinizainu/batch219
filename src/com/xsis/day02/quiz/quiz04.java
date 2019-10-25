package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        s = scan.nextLine();
        if(s.length()>20){
            System.out.println("Many Character");
        } else {
            System.out.println("Your character too short");
        }
    }
}
