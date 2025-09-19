import java.util.Scanner; 

public class averageofthreenubmers {
    public static void main(String [] agrs) { 
            Scanner scanner = new Scanner(System.in);

        System.out.println("give the first nubmer:"); 
        int first = Integer.parseInt(scanner.nextLine()); 

        System.out.println("give the second nubmer:"); 
        int second = Integer.parseInt(scanner.nextLine()); 

        System.out.println("give the third nubmer:"); 
        int third = Integer.parseInt(scanner.nextLine()); 

        double average = (first + second + third) / 3.0;
        
        System.out.println("The average is" + average);



    }
}
