import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        int year = 10384;
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeap = true;}
        else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeap = false;
        }
        if (isLeap) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }

    }
}
