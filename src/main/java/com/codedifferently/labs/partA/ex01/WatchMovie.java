package com.codedifferently.labs.partA.ex01;
import java.util.Scanner;
public class WatchMovie {
    public static String watchMovie() {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        System.out.println("Enter the movie ticket price \n");
        int price = scanner.nextInt();
        int rating = 5;
        /* Your code goes here*/
        if (12 <= price && rating == 5) {
            response = "I’m interested in watching the movie";
        } else {
            response = "I am not interested in watching the movie";
        }

        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}
