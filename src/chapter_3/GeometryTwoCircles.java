package chapter_3;

import java.util.Scanner;


public class GeometryTwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1’s center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter circle2’s center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double o1o2 = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));


        if (o1o2 <= r1 - r2)
            System.out.println("circle2 is inside circle1");
        else if (o1o2 <= r2 - r1)
            System.out.println("circle1 is inside circle2");
        else if (o1o2 <= r1 +r2)
            System.out.println(" circles intersect ");
        else if (o1o2 >= r1+r2)
            System.out.println(" circles are not intersect ");



    }
}