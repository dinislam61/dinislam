package chapter_2;

import java.util.Scanner;

public class ConvertMileToKilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        double km = miles * 1.6;

        System.out.print(miles + " miles is " + km + " km");
    }
}






