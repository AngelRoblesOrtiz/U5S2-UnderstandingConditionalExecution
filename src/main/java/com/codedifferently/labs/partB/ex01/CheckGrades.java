package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("What was your grade in Math?");
        int mathGrade = scanner.nextInt();
        System.out.println("What was your grade in Science?");
        int sciGrade = scanner.nextInt();
        System.out.println("What was your grade in Geography?");
        int geoGrade = scanner.nextInt();
        System.out.println("What was your grade in English?");
        int engGrade = scanner.nextInt();
        System.out.println("What was your grade in Java?");
        int javaGrade = scanner.nextInt();

        double totalGrade = mathGrade + sciGrade + geoGrade + engGrade + javaGrade;
        System.out.println("Total grade in five subjects: " + totalGrade);
        System.out.println("My percentage: " + (totalGrade / 5) + "%");

        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}