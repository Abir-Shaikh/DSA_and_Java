// To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int num = 1331;
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            res = res * 10 + digit;
        }
        System.out.println(res);
    }
}
