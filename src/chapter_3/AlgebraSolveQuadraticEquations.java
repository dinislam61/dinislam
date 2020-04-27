package chapter_3;

import java.util.Scanner;

public class AlgebraSolveQuadraticEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        final double DISCRIMINANT = Math.pow( b , 2 ) - 4 * a * c;

        double r1 = ( (-1) * b + Math.sqrt( DISCRIMINANT ) ) / 2 * a;
        double r2 = ( (-1) * b - Math.sqrt( DISCRIMINANT ) ) / 2 * a;
        double r =  (-1) * b / 2 * a;

        if  (DISCRIMINANT > 0 )
            System.out.println("The equation has two roots " + r1 +
                    " and " + r2 );
        else if (DISCRIMINANT == 0)
            System.out.println("The equation has one root " + r );
        else if (DISCRIMINANT < 0)
            System.out.println("The equation has no real roots" );

    }
}
