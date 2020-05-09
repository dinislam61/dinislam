package chapter_5;

public class ConversionFromCToFAndFToC {
    public static void main(String[] args) {
        double celsius1 = 0;
        double fahrenheit1 = (celsius1 * 9/5) + 32 ;

        double fahrenheit2 = 20;
        double celsius2 = 5 * (fahrenheit2 - 32) / 9;

        System.out.println("Celsius    Fahrenheit      |    Fahrenheit    Celsius");
        while (celsius1 <= 100){
            while (fahrenheit2 <= 270){
                System.out.printf("%3.0f           %7.3f      | %6.0f             %3.3f", celsius1, fahrenheit1, fahrenheit2, celsius2);
                System.out.println();
                fahrenheit2 +=5;
                celsius2 = 5 * (fahrenheit2 - 32) / 9;
                celsius1 += 2;
                fahrenheit1 = (celsius1 * 9/5) + 32 ;
            }

        }


    }
}
