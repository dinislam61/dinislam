package chapter_5;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int score = 0;

        while (score != -1){
            System.out.println("Enter your score: ");
             score = input.nextInt();
            if ( (score >= 60) && (score <= 100)) {
                System.out.println("You pass the exam.");
                System.out.println(" ");
            }
            else if ( (score < 60) && (score >= 0)) {
                System.out.println("You don't pass the exam.");
                System.out.println(" ");
            }
            else if (score == -1)
                System.out.println("No numbers are entered except 0");
            else {
                System.out.println("Not correct score.");
                System.out.println(" ");
            }
        }




    }
}
