package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class listsize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nKopa : " + names.size());
        scanner.close();
    }
}

