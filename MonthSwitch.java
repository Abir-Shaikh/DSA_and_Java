//Write a program to Find the number of days in a month using a switch statement

import java.util.Scanner;
public class MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();

        System.out.println("Enter the number of year: ");
        int year = sc.nextInt();

        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (year % 4 == 0 || (year % 100 != 0) && (year % 400 == 0)) {
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            default:
                days = 30;
                break;
        }
        System.out.println("The month is " + month);
    }
}

