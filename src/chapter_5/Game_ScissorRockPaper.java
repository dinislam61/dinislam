package chapter_5;

import java.util.Scanner;

public class Game_ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 2;
        int min = 0;
        int j = 0;
        int k = 0;

        for (int i = 0; i < 100; i++) {

            int random = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(random);
            System.out.println("scissor (0), rock (1), paper (2): ");
            int choice = input.nextInt();

            if (choice < 0 || choice > 2)
                System.out.println("Incorrect choice");
            if (random == 0)
                if (choice == 0)
                    System.out.println("The computer is scissor. You are scissor too. It is a draw");
                else if (choice == 1) {
                    System.out.println("The computer is scissor. You are rock. You won!");
                    j += 1;
                }
                else {
                    System.out.println("The computer is scissor. You are paper. You lose :(");
                    k += 1;
                }
            else if (random == 1)
                if (choice == 1)
                    System.out.println("The computer is rock. You are rock too. It is a draw");
                else if (choice == 2) {
                    System.out.println("The computer is rock. You are paper. You won!");
                    j += 1;
                }
                else {
                    System.out.println("The computer is rock. You are scissor. You lose :(");
                    k += 1;
                }
            else if (random == 2)
                if (choice == 2)
                    System.out.println("The computer is paper. You are paper too. It is a draw");
                else if (choice == 1) {
                    System.out.println("The computer is paper. You are rock.  You lose :(");
                    k += 1;
                }
                else {
                    System.out.println("The computer is paper. You are scissor.  You won");
                    j += 1;
                }
            System.out.println("");
            if (k == 3) {
                System.out.println("You lost " + j + " : " + k);
                break;
            }
            if (j == 3) {
                System.out.println("You won " + j + " : " + k);
                break;
            }



        }
    }
}