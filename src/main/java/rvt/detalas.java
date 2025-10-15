package rvt;
import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        
        final int SCREW_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;

        Scanner input = new Scanner(System.in);

       
        System.out.print("Skruvju skaits: ");
        int skruves = input.nextInt();

        System.out.print("Uzgrieznu skaits: ");
        int uzgriezni = input.nextInt();

        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = input.nextInt();

        
        boolean kluda = false;

        if (uzgriezni < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            kluda = true;
        }

        if (paplaksnes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            kluda = true;
        }

        if (!kluda) {
            System.out.println("Pasutijums ir kartiba.");
        }

        
        int kopaCena = (skruves * SCREW_PRICE) + (uzgriezni * NUT_PRICE) + (paplaksnes * WASHER_PRICE);

        System.out.println("Kopeja cena: " + kopaCena + " centi");
    }
}
    
