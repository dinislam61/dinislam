package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialApplication2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount:  ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage:  ");
        double monthlyInterestRate = input.nextDouble();

        System.out.print("Enter number of years:  ");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate/100/12, numberOfYears * 12);
        DecimalFormat df = new DecimalFormat("#.##");
        double fiv = Double.valueOf(df.format(futureInvestmentValue));
        System.out.print("Future value is $ " + fiv);


    }
}
