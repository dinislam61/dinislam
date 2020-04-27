package chapter_2;

import java.util.Scanner;

public class VolumeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides of the Equilateral\n" +
                "triangle: ");
        double length = input.nextDouble();
        System.out.print("Enter length of the height of the Equilateral\n" +
                "triangle: ");
        double height = input.nextDouble();

        double area = Math.sqrt(3.0)/4 * Math.pow(length, 2);
        System.out.println("The area is " + area);
        double volume = area * height;

        System.out.println("The volume of the Triangular prism is " + volume);
    }
}

