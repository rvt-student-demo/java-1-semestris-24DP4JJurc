package rvt;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int min = scanner.nextInt();

        System.out.println("Enter End:");
        int max = scanner.nextInt();

        for ( int i = min; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

