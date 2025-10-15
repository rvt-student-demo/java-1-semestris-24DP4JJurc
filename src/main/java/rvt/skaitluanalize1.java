package rvt;
import java.util.Scanner;

public class skaitluanalize1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int skaits = 0;
        int summa = 0;
        int lielakais = Integer.MIN_VALUE;
        int mazakais = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            int skaitlis = input.nextInt();

            if (skaitlis <= 0) {
                break;
            }

            skaits++;
            summa += skaitlis;

            if (skaitlis > lielakais) {
                lielakais = skaitlis;
            }

            if (skaitlis < mazakais) {
                mazakais = skaitlis;
            }
        }

        if (skaits > 0) {
            double videjaVertiba = (double) summa / skaits;
            System.out.println("\nIevadito skaitlu skaits: " + skaits);
            System.out.println("Skaitlu summa: " + summa);
            System.out.println("Videja vertiba: " + videjaVertiba);
            System.out.println("Lielakais skaitlis: " + lielakais);
            System.out.println("Mazakais skaitlis: " + mazakais);
        } else {
            System.out.println("Netika ievadits neviens pozitivs skaitlis.");
        }
    }
    
}
