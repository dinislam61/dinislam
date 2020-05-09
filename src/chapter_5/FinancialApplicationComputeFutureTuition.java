package chapter_5;

public class FinancialApplicationComputeFutureTuition {

    public static void main(String[] args) {
        double tuition = 10000;
        double increase = 1.06;
        double endValue = 1;

        for (int year = 1; year <= 10 ; year++) {
            endValue = tuition * Math.pow(increase , year);
            switch (year % 100) {
                case 1:
                    System.out.printf("The tuition in one years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("The tuition in two years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("The tuition in three years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("The tuition in four years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 5:
                    System.out.printf("The tuition in five years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 6:
                    System.out.printf("The tuition in six years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 7:
                    System.out.printf("The tuition in seven years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 8:
                    System.out.printf("The tuition in eight years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 9:
                    System.out.printf("The tuition in nine years: %5.2f", endValue);
                    System.out.println();
                    break;
                case 10:
                    System.out.printf("The tuition in ten years: %5.2f", endValue);
                    System.out.println();
                    break;
                default: break;
            }

        }
        double endValue2 = 0;
        double inTenYears = tuition * Math.pow(increase , 10);

        for (int years1 = 1; years1 <= 4 ; years1++) {
            double endValue1 = inTenYears * Math.pow(increase ,years1 );
             endValue2 += endValue1;
             if (years1 == 4)
                 System.out.printf("The total cost of four years worth of tuition after the tenth year: %5.2f" , endValue2);

        }

    }

}
