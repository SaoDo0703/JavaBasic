package com.javabasic;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class CheckTheDate {
    public static void main(String[] args) {
        int day = enterDayInWeek();
        checkDayInWeek(day);
        int month = enterMonthInYear();
        checkMonthInYear(month);
    }



    public static int enterDayInWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day : ");
        int day = scanner.nextInt();
        return day;
    }



    public static int enterMonthInYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month : ");
        int month = scanner.nextInt();
        return month;
    }




    public static void checkDayInWeek(int day) {
        switch (day) {
            case (0): {
                System.out.println("SUNDAY");
                break;
            }
            case (1): {
                System.out.println("MONDAY");
                break;
            }
            case (2): {
                System.out.println("TUESDAY");
                break;
            }
            case (4): {
                System.out.println("WEDNESDAY");
                break;
            }
            case (5): {
                System.out.println("THURSDAY");
                break;
            }
            case (6): {
                System.out.println("FRIDAY");
                break;
            }
            case (7): {
                System.out.println("SATURDAY");
                break;
            }
            default: {
                System.out.println("The number is invalid");
                break;
            }
        }
    }



    public static void checkMonthInYear(int month){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("Month " + month + " there are 31 days ");
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("Month " + month + " there are 30 days");
                break;

            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter year: ");
                int year = scanner.nextInt();

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Month " + month + " Year " + year + " there are 29 days  ");
                } else {
                    System.out.println("Month " + month + " Year " + year + " there are 28 days ");
                }
                break;

            default:
                System.out.println("Invalid month input");
        }
    }
}
