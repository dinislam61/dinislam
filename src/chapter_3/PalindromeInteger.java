package chapter_3;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (number < 100 || number > 999)
            System.out.println("Enter a three-digit integer ");

        else if (number / 100 == number % 10)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");

    }
}
