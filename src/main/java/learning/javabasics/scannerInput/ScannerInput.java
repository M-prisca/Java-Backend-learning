package main.java.learning.javabasics.scannerInput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        boolean c = sc.nextBoolean();

        sc.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}

// specifying the data type of the input values with next().
