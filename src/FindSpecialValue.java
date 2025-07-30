import java.util.Scanner;

public class FindSpecialValue {
    public static void main (String [] args) {
        // Create Scanner object for user input
        try (Scanner scnr = new Scanner(System.in)) {

            // Declare variable for special number
            int specialNum;

            // Prompt user for input
            System.out.print("Enter a number: ");
            // Read user input
            specialNum = scnr.nextInt();

            // Check if the number is one of the special values
            if ((specialNum == -99) || (specialNum == 0) || (specialNum == 44)) {
                System.out.println("Special number");
            }
            else {
                System.out.println("Not special number");
            }
        }
    }
}
