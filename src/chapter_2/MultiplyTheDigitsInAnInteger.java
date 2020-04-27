package chapter_2;

import java.util.Scanner;
public class MultiplyTheDigitsInAnInteger {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();

        int number1 = number % 10;
        int number2 = (number / 10) % 10;
        int number3 = (number/ 100);


        int multiplication = number1 * number2 * number3;
        System.out.println("The multiplication of all digits in " +
                number + " is " + multiplication);



    }

}

