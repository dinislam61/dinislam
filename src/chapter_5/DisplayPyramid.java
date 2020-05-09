package chapter_5;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int number = input.nextInt();
        int super_temp = number;

        while(number >= 1){
            int temp2 = number;
            while (temp2 < super_temp) {
                System.out.print("  ");
                temp2++;
            }

            int temp = number;

            while (temp >= 1){
                System.out.print(temp + " " );
                temp -= 1;
            }

            int temp1 = temp+2;
            while (temp1 <= number) {
                System.out.print(temp1 + " ");
                temp1 += 1;
            }

            System.out.println("");
            number--;
        }

    }
}
