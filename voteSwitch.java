// Write a program to check whether a person is eligible to vote or Not using switch statement

import java.util.Scanner;
public class voteSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=0;
        System.out.printf("Enter the age : ");
        age = sc.nextInt();
        int res = age >= 18?1:2;//The program uses a ternary operator to check whether the age is greater
        // than or equal to 18. If it is, the value of the variable res is set to 1. Otherwise,
        // it is set to 0.
        switch (res) {
            case 1 -> System.out.println("You are old");
            case 2 -> System.out.println("You are not old enough");
            default -> System.out.println("invalid age");
        }
    }
}
