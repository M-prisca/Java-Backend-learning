package main.java.learning.javabasics.exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 100;
        int operationCount = 0;

        boolean continueProgram = true;
        while (value > 0 && continueProgram) {

            System.out.print("Enter a number to subtract: ");
            int input = scanner.nextInt();

            while (input < 0) {
                System.out.println("Invalid. Please enter a non-negative number!");
                System.out.print("Enter a number to subtract: ");
                input = scanner.nextInt();
            }
            value = value - input;
            operationCount++;

            System.out.println("Updated value: " + value);

            if (value <= 0) {
                System.out.println("Value has reached 0 or below. Stopping.");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("no")) {
                continueProgram = false;
            }

        }
        System.out.println("Total operations: " + operationCount);

        scanner.close();
    }
}
