package chapter_6;
import java.util.Scanner;

public class Exercise_06_06 {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        // Display pattern
        displayPattern(numberOfRows);
    }

    /** displayPattern Method */
    public static void displayPattern(int n) {

        for (int r = 1; r <= n; r++) {


            // Print numbers
            for (int i = 1; i <= r; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}