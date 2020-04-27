package chapter_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = 0 , min = 0 , mid = 0;

        if (num1 > num2 && num1 > num3)
            max = num1;
        else if ((num1 < num2) && (num1 < num3))
            min = num1;
        else
             mid = num1;

        if (num2 > num1 && num2 > num3)
             max = num2;
        else if (num2 < num1 && num2 < num3)
             min = num2;
        else
             mid = num2;

        if (num3 > num1 && num3 > num2)
             max = num3;
        else if (num3 < num2 && num3 < num1)
             min = num3;
        else
             mid = num3;

        System.out.println(min + " " + mid + " " + max);
    }
}
