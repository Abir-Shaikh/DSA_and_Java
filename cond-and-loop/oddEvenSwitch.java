// Write a program to Check whether the number is even or odd using switch statement

import java.util.Scanner;
public class oddEvenSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number : ");
        num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.printf("Even Number");
                break;

            case 1:
                System.out.printf("odd Number");
                break;
        }
    }
}
