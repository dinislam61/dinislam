package chapter_5;

import java.util.Scanner;

public class DisplayFourPatternsUsingLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();
        System.out.println("Pattern A");
        for (int i = 0; i <= number ; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern B");

        for (int k = 0; k < number ; k++) {

            for (int j = number; j > k; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern C");


        for (int m = 0; m <= number ; m++) {
            for (int j = number-1; j >= m ; j--) {
                System.out.print("  ");

            }

            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern D");


        for (int n = 0; n < number ; n++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("  ");
            }

            for (int j = number; j > n; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }



    }



}
