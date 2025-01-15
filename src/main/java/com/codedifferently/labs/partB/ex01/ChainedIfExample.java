package com.codedifferently.labs.partB.ex01;

public class ChainedIfExample { //creates the parent class
    public static String incomeAndTax(){ //creates the incomeAndTax method
        String response = ""; //creates empty string response

        double income = 30000, tax; //creates two doubles, income and tax, tax is empty
        if (income <= 15000) { //if income is less than or equal to 15000
            tax = 0; //then tax equals 0
        } else if (income <= 25000) { //if income is less than or equal to 25000
            tax = 0.05 * (income - 15000); //then tax equals 0.05 * (income - 15000)
        } else { //if nothing else then
            tax = 0.05 * (income - (25000 - 15000)); //tax equals this formula
            tax += 0.10 * (income - 25000); //add on this formula to tax
        } //close the if statement
        response += income + tax; //set response equal to the income and tax

        return response; //return the response
    } //close the incomeAndTax method
    public static void main(String args[]) { //creates the main class
        String totalOutput = incomeAndTax(); //sets a string equal to incomeAndTax output
        System.out.println(totalOutput); //prints the previous string
    } //closes the main class
} //closes the parent class
