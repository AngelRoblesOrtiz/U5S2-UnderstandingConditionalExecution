package com.codedifferently.labs.partB.ex02;

public class TernaryOperatorExample { //creates parent class

    public static String tern(){ //creates the tern method class
        String response = ""; //creates empty response string

        String s1 = "Hello"; //creates string s1
        String s2 = "Goodbye"; //creates string s2
        String answer = s1.equals(s2) ? "Yes" : "No"; //sets a string equal to a ternary
        response += (answer); //sets response to the answer

        return response; //returns the response

    } //closes the method class
    public static void main(String args[]) { //creates main class
        String output = tern(); //sets a string equal to tern method output
        System.out.println(output); //prints the string

    } //closes main class
} //closes parent class
