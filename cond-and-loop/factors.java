//Input a number and print all the factors of that number

import java.util.Scanner;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 36;
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
