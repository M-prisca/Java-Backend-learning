package main.java.learning.javabasics.exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count, sum = 0, largest, smallest, evenCount = 0, oddCount = 0, aboveHundredCount = 0;
        double average;
        int[] values;

        System.out.print("How many values do you want to enter? : ");
        count = scanner.nextInt();
        values = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        largest = values[0];
        smallest = values[0];
        for (int i = 0; i < values.length; i++) {

            sum += values[i];
            if (values[i] > largest) {
                largest = values[i];
            }
            if (values[i] < smallest) {
                smallest = values[i];
            }
            if (values[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (values[i] > 100) {
                aboveHundredCount++;
            }

        }

        average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest nmber: " + smallest);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Numbers above 100: " + aboveHundredCount);

        if (average > 50) {
            System.out.println("The average is greater than 50.");
        } else {
            System.out.println("The average is not greater than 50.");
        }

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }

        scanner.close();
    }
}