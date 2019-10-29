package com.xsis.day03.quiz03;

public class quiz05 {
    static final double expanding = .03;
    public static void main(String[] args) {
        double population = 30000, populationExpand;
        int year = 1;

        while (population<=100000){
            populationExpand = population*expanding;
            population +=populationExpand;
            year++;
        }
        System.out.println(year);
    }
}
