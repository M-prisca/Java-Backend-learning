package main.java.learning.javabasics.exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for a word.
        System.out.print("Enter a word: ");
        String word = scanner.next();

        // 2. Ask the user for 3 numbers.
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        // 3. Calculate the sum of the numbers.
        int sum = num1 + num2 + num3;

        // 4. Calculate the average.
        double average = (double) sum / 3;
        System.out.println("The average: " + average);

        // 6. Display:
        // the largest number,
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("Largest: " + largest);

        // the smallest number.
        int smallest;
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        System.out.println("Smallest: " + smallest);

        // 6.Display whether the average is greater than 50.
        if (average > 50) {
            System.out.println("The average is greater than 50.");
        } else {
            System.out.println("The average is not greater than 50.");
        }

        // If the average is greater than 80:
        // display "Excellent".
        // If the average is between 50 and 80:
        // display "Good".
        // Otherwise:
        // display "Needs Improvement".
        if (average > 80) {
            System.out.println("Excellent!");
        } else if (average >= 50 && average < 80) {
            System.out.println("Good!");
        } else {
            System.out.println("Needs Improvement.");
        }

        // 10. Display the word entered by the user in uppercase.
        System.out.println("The word in uppercase: " + word.toUpperCase());
        // 11. Display the length of the word.

        System.out.println("The word's length: " + word.length());

        scanner.close();
    }
}
