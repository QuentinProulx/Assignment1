// @QUENTIN PROULX
// ASSIGNMENT 1: BALANCE CALCULATOR

package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Program introduction
        System.out.println("------------");
        System.out.println("BALANCE CALCULATOR");
        System.out.println("------------\n");

        // Prompts user to enter their current balance
        System.out.print("Please enter your initial balance (5 for $5): ");
        double balance = sc.nextDouble();

        // Prompts user to enter their annual interest rate
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double interest = sc.nextDouble();

        // Prompts user to enter the number of years they want to save money
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int years = sc.nextInt();

        // Displays information
        System.out.println("-------------------");
        System.out.printf("%-20s: $%.8s%n","Initial Balance",balance);
        System.out.printf("%-20s: %s%%%n","Annual Interest Rate",interest);
        System.out.printf("%-20s: %d Years %n","Saving Years",years);
        System.out.println("-------------------");
        System.out.printf("%-20s: $%.8s%n","Balance After "+years+" Years",balance*Math.pow((interest/100)+1,5));
        System.out.println("-------------------");

    }
}