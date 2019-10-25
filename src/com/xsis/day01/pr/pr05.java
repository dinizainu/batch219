package com.xsis.day01.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        int time, weeks, days, hours, minutes, seconds, residu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ebter your time in seconds: ");
        time = scan.nextInt();
        weeks = time/604800;
        residu = time%604800;
        days = residu/86400;
        residu = residu%86400;
        hours = residu/3600;
        residu = residu%3600;
        minutes = residu/60;
        residu = residu%60;
        seconds = residu;
        residu = residu%1;
        System.out.println("So your time is: "+ weeks+" weeks "+days+" days " +hours+ " hours "+minutes+" minutes "+seconds+ " seconds");
    }
}
