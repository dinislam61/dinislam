package chapter_3;

import java.util.Scanner;

public class GameScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 2;
        int min = 0;

        int random = (int)(Math.random() * (max -min+1) +min);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int choice = input.nextInt();

        if (choice < 0 || choice > 2)
            System.out.println("Incorrect choice");
        if (random == 0 )
            if (choice == 0)
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
            else if (choice == 1)
                System.out.println("The computer is scissor. You are rock. You won!");
            else
                System.out.println("The computer is scissor. You are paper. You lose :(");
        else if (random == 1)
            if (choice == 1)
                System.out.println("The computer is rock. You are rock too. It is a draw");
            else if (choice == 2)
                System.out.println("The computer is rock. You are paper. You won!");
            else
                System.out.println("The computer is rock. You are scissor. You lose :(");
        else if (random == 2)
            if (choice == 2)
                System.out.println("The computer is paper. You are paper too. It is a draw");
            else if (choice == 1)
                System.out.println("The computer is paper. You are scissor. You won");
            else
                System.out.println("The computer is paper. You are rock. You lose :(");



    }
}
