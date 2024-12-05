// @QUENTIN PROULX
// ASSIGNMENT 1: PRICE CALCULATOR

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("PRICE CALCULATOR");
        System.out.println("---------------------");

        // Context
        System.out.println("You are buying a video game...");

        // Prompts user to enter name of their video game
        System.out.print("Enter name of video game: ");
        String name = sc.nextLine();

        // Prompts user to enter price of their video game
        System.out.print("Enter price of video game (5 for $5): ");
        double price = sc.nextDouble();

        // Prompts user to enter discount for video game
        System.out.print("Enter discount ratio (5 for 5%): ");
        double discount = sc.nextDouble();

        double noTax = price - price*(discount/100); // Calculates price without federal or provincial taxes
        double tax = noTax + noTax*((5+9.975)/100); // Calculates price with federal and provincial taxes

        // Display Sales Information
        System.out.println("\n---------------------");
        System.out.println("Purchase of "+name.toUpperCase()+":");
        System.out.printf("%n%-20s: $%.5s", "Original Price",price);
        System.out.printf("%n%-20s: %s%%", "Discount Rate",discount);
        System.out.printf("%n%-20s: $%.5s", "Price Before Tax",noTax);
        System.out.println("\n---------------------");
        System.out.printf("%-20s: %s","Federal Sales Tax","5%");
        System.out.printf("%n%-20s: %s","Provincial Sales Tax","9.975%");
        System.out.printf("%n%-20s: $%.5s","Final Price",tax);
        System.out.println("\n---------------------");

    }
}