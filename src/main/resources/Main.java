// @QUENTIN PROULX
// ASSIGNMENT 1: PERSONAL INFO

package org.example;

import java.util.Scanner;

public class Main {

    static boolean looping = true; // Determines whether gender loop is currently in session

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Name of program
        System.out.println("------------------------");
        System.out.println("PERSONAL INFO");
        System.out.println("------------------------");

        // Prompts user to enter their name
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        // Prompts user to enter their age
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        // Makes sure that one of the available genders are chosen
        String gender = "";

        while (looping) {

            System.out.print("Please enter your gender (Male, Female, or Other): ");

            gender = sc.nextLine();

            if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other")) {

                System.out.println("You must select either Male, Female, or Other. Try again;");

            } else {

                looping = false;
                continue;

            }

        }

        // Prompts user to enter their favorite subject

        System.out.print("Please enter your favorite school subject: ");
        String subject = sc.nextLine();

        // Prompts user to enter their 3 favorite numbers (using println so that the number is on the next line)
        System.out.print("Please enter the value of e (2.7182818): ");
        double e = sc.nextDouble();

        // Displays all the information the user provided using the printf() function
        System.out.printf("------------------------%n");
        System.out.printf("%-11s: %-10s%n", "Name", name);
        System.out.printf("%-11s: %-10d%n", "Age", age);
        System.out.printf("%-11s: %-10s%n", "Gender", gender);
        System.out.printf("%-11s: %-10s%n", "Subject", subject);
        System.out.printf("%-11s: %-10.4s%n", "e", e);
        System.out.println("------------------------");

    }
}