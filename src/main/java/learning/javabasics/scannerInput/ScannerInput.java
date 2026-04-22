package main.java.learning.javabasics.scannerInput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.print("Enter a sentence: ");
        sc.nextLine();
        String sentence = sc.nextLine();

        System.out.println(word + " " + sentence);

        sc.close();

    }

}

// Printing a whole sentence containing spaces with nextLine().
