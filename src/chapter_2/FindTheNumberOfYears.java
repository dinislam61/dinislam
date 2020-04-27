package chapter_2;

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes = input.nextInt();

        long days = minutes / 60 / 24 % 365;
        long years = minutes / 60 / 24 / 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");

    }
}



