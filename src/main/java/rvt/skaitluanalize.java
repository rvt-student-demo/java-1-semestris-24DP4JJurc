package rvt;
import java.util.Scanner;

public class skaitluanalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0; 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            int number = scanner.nextInt();

            if (number <= 0) {
                break;
            }
            count++;
            sum += number;

            if (number > max) {
                max = number;
            }
            if (number < min){
                min = number;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\nIevadito skaitlu skaits: " + count);
            System.out.println("Skaitlu summa: " + sum);
            System.out.println("Videja vertiba: " + average);
            System.out.println("Lielakais skaitlis: " + max);
            System.out.println("Mazakais skaitlis: " + min);
        } else {
            System.out.println("Netika ievadits neviens poziti1vs skaitlis.");
        }

        scanner.close();
    }
}

