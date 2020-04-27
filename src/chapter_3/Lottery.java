package chapter_3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print( "Enter your lottery pick (three digits): " );
        int guess = input.nextInt();

        int lD1 = lottery / 100;
        int lD2 = lottery / 10 % 10;
        int lD3 = lottery % 10 ;

        int gD1 = guess / 100 ;
        int gD2 = guess / 10 % 10;
        int gD3 = guess % 10 ;


        System.out.println( "The lottery number is " + lottery);

        if (guess == lottery)
                System.out.println( "Exact match: you win $12,000" );
        else if ( (lD1 == gD1 || lD1 == gD2 ||lD1 == gD3)
                    && (lD2 == gD1 || lD2 == gD2 || lD2 == gD3)
                    && (lD3 == gD1 || lD3 == gD2 || lD3 == gD3))
                System.out.println( "Match all digits: you win $5,000" );
        else if ( (lD1 == gD1 || lD1 == gD2 ||lD1 == gD3)
                || (lD2 == gD1 || lD2 == gD2 || lD2 == gD3)
                || (lD3 == gD1 || lD3 == gD2 || lD3 == gD3) )
            System.out.println( "Match one digit: you win $2,000" );
        else
            System.out.println( "Sorry, no match" );
        }
    }

