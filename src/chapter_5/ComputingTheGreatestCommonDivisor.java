package chapter_5;

import java.util.Scanner;

public class ComputingTheGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();
        int min = ( n1 > n2 )? n2 : n1;
        int gcd = 1;
        while ( true ) {
            if ( n1 % min == 0 && n2 % min == 0 ){
                gcd = min;
                break;
            }
            min--;


        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

    }


}

