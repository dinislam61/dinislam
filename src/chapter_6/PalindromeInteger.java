package chapter_6;
import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (isPalindrome(number) == true){
            System.out.println(number + " is a palindrome");
        }
        else
            System.out.println(number + " is not a palindrome");


    }

    public static boolean isPalindrome(int number){
        if (number == reverse(number)){
            return true;
        }
        else
            return  false;

    }

    public static int reverse(int number){
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);

    }

}
