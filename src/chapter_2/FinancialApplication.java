package chapter_2;

import java.util.Scanner;
public class FinancialApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");

        final double RATE = 1 + 0.0375 / 12;
        double investment = input.nextDouble();

        double first = investment * RATE;
        System.out.println("After the first month, the account value is: " + first);

        double second = (investment + first) * RATE;
        System.out.println("After the second month, the account value is: " + second);

        double third = (investment + second) * RATE;
        System.out.println("After the third month, the account value is: " + third);

        double fourth = (investment + third) * RATE;
        System.out.println("After the fourth month, the account value is: " + fourth);

        double fifth = (investment + fourth) * RATE;
        System.out.println("After the fifth month, the account value is: " + fifth);

        double sixth = (investment + fifth) *RATE;
        System.out.println("After the sixth month, the account value is: " + sixth);

    }
}
