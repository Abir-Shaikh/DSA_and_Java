//check the number is neon or not

import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}