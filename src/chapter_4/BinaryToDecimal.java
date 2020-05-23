package chapter_4;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary value: ");
        String i = input.nextLine();
        System.out.println(Integer.parseInt(i, 2));

    }
}