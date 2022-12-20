import java.util.Scanner;

public class ScannerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Validate input using a regex that matches only integers
        while (!scanner.hasNext("\\d+")) {
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }

        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

    }
}
