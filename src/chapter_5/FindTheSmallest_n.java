package chapter_5;

public class FindTheSmallest_n {
    public static void main(String[] args) {
        int num = 12000;
        int n = 0;

        while (Math.pow(n , 3) < num ){
            n++;
        }
        System.out.println("The largest n such that n^3 > 12,000 is: " +  n + " (" + Math.pow(n , 3) + ")" );
    }
}
