// @QUENTIN PROULX
// ASSIGNMENT 1: NUMBER CONVERTER

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Name of the program
        System.out.println("--------------------");
        System.out.println("OCTAL TO DECIMAL CONVERTER");
        System.out.println("--------------------");

        // Inform the user on what an octal number is
        System.out.println("\nNOTE: OCTAL NUMBERS ARE FROM 0-7");

        // Prompt user for any octal number
        System.out.print("Enter any Octal Number: ");
        String octal = sc.nextLine();

        // Define variable before loop to save for later
        long decimal = 0;

        // Conversion (byte because you're never going to have a HUGE number of digits)
        for (byte i = 0; i <= octal.length()-1; i++) {

            // Math.pow is by default a double, so we need to convert it to long through (long)
            // The rightmost digit is the lowest, so we use (octal.length()-1)-i to cycle from the lowest digit to the highest digit (octal.length()-1 being the index of the rightmost digit in a 4-digit number)
            // To convert a number in ASCII to an integer we just need to subtract 48 from it
            decimal = (long) ((octal.charAt((octal.length()-1)-i)-48) * Math.pow(8,i));

        }

        // Results
        System.out.println("--------------------");
        System.out.printf("%-10s: %d", "Decimal Form: ", decimal);
        System.out.println("\n--------------------");

    }
}