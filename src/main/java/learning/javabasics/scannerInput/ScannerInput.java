package main.java.learning.javabasics.scannerInput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();

        System.out.println("hello, " + firstName + " " + lastName + "!");
        sc.close();
    }

}
