package rvt;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int min = scanner.nextInt();

        System.out.println("Enter End:");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        int formulaSum = (n * (n + 1)) / 2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        scanner.close();
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();

        
        int loopSumSquares = 0;
        for (int i = 1; i <= n; i++) {
            loopSumSquares += i * i;
        }

       
        int formulaSumSquares = (n * (n + 1) * (2 * n + 1)) / 6;

        
        int formulaSumCubes = (int) Math.pow((n * (n + 1)) / 2, 2);

        System.out.println("Loop Sum of Squares = " + loopSumSquares);
        System.out.println("Formula Sum of Squares = " + formulaSumSquares);
        System.out.println("Formula Sum of Cubes = " + formulaSumCubes);

        scanner.close();
    }
}
