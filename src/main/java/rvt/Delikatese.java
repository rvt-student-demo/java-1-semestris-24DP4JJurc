package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String produkts = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = 0.0;
        if (scanner.hasNextDouble()) {
            cena = scanner.nextDouble();
        }
        scanner.nextLine(); 

        System.out.print("Ekspress piegade (0==ne, 1==ja): ");
        int ekspress = 0;
        if (scanner.hasNextInt()) {
            ekspress = scanner.nextInt();
        }
        scanner.nextLine(); 

        double piegade = 0.0;

        if (cena < 10) {
            piegade = 2.0;
        }

        if (ekspress == 1) {
            piegade += 3.0;
        }

        double kopa = cena + piegade;
        
        System.out.println("\nRekins:");
        System.out.println(produkts + "   " + cena);
        System.out.println("piegade   " + piegade);
        System.out.println("kopa   " + kopa);
        

        scanner.close();
    }
}

    

