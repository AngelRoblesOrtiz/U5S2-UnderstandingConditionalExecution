package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        int response = 0;
        /* Put your code in between these comments : Top */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age below: ");
        int userAge = scanner.nextInt();
        int fare = 0;

        if (userAge < 11) {
            fare = 3;
        } else if (11 <= userAge && userAge < 65) {
            fare = 5;
        } else {
            fare = 3;
        }

        response = fare;


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        int age = 11;
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println(computeOutput);


    }
}
