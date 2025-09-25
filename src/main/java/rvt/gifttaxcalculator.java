package rvt;

import java.util.Scanner;

public class gifttaxcalculator {

    public static double calculateGiftTax(double value) {
        if (value < 5000) {
            return 0;
        } else if (value <= 25000) {
            return 100 + (value - 5000) * 0.08;
        } else if (value <= 55000) {
            return 1700 + (value - 25000) * 0.10;
        } else if (value <= 200000) {
            return 4700 + (value - 55000) * 0.12;
        } else if (value <= 1000000) {
            return 22100 + (value - 200000) * 0.15;
        } else {
            return 142100 + (value - 1000000) * 0.17;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the gift $: ");
        double value = scanner.nextDouble();

        double tax = calculateGiftTax(value);

        if (tax == 0) {
            System.out.println("No gift tax needs to be paid.");
        } else {
            System.out.printf("Gift tax: $%.2f%n", tax);
        }

        scanner.close();
    }
}

