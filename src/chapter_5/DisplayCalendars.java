package chapter_5;

import java.util.Scanner;

public class DisplayCalendars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a first day: ");
        int firstDay = input.nextInt();
        String week_days = "_____________________________________________\n" +
                           "   Mon   Tue   Wed   Thu   Fri   Sat   Sun   \n";
        for (int i = 0; i < 12; i++) {
            switch (i) {

                case 0:
                    System.out.println("                 January " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 1:
                    System.out.println("                 February " + year);
                    System.out.println(week_days);
                    int feb;
                    if (year % 4 == 0) {
                        feb = 29;
                    }
                    feb = 28;
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= feb; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (feb + firstDay)%7;
                    System.out.println();
                    break;
                case 2:
                    System.out.println("                 March " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("                 April " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 30; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (30 + firstDay)%7;
                    System.out.println();
                    break;
                case 4:
                    System.out.println("                 May " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 5:
                    System.out.println("                 June " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 30; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (30 + firstDay)%7;
                    System.out.println();
                    break;
                case 6:
                    System.out.println("                 July " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 7:
                    System.out.println("                 August " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 8:
                    System.out.println("                 September " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 30; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (30 + firstDay)%7;
                    System.out.println();
                    break;
                case 9:
                    System.out.println("                 October " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
                case 10:
                    System.out.println("                 November " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 30; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (30 + firstDay)%7;
                    System.out.println();
                    break;
                case 11:
                    System.out.println("                 December " + year);
                    System.out.println(week_days);
                    for (int k = 0; k < firstDay; k++) {
                        System.out.print("      ");
                    }
                    for (int j = 1; j <= 31; j++) {
                        int temp = j + firstDay;
                        System.out.printf("    %2d",j);
                        if(temp % 7 == 0){
                            System.out.println();
                        }
                    }
                    System.out.println();
                    firstDay = (31 + firstDay)%7;
                    System.out.println();
                    break;
            }


        }


    }
}
