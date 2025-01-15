package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
        int x = 20, y = 0;
        y = (x != 1) ? (y = 90) : (y = y);
        response += "Value of y is: " + y + "\n";
        y = (x == 20) ? (y = 61) : (y = y);
        response += "Value of y is: " + y;

        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
