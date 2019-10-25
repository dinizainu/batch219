package com.xsis.day02.condition;

import java.util.Scanner;

public class condition04 {
    public static void main(String[] args) {
        int score;
        char grade=' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("Input score: ");
        score = scan.nextInt();
        if(score>=90){
            grade='A';
        } else if( score < 90){
            grade='B';
        }
        System.out.println("Grade: "+grade);
    }
}
