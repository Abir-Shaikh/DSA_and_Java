//To find Armstrong Number between two given number.
//Meaning of armstrong no is that the last digit will always be the remainder

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        int num = 153, remainder, result = 0, originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            result +=  Math.pow(remainder,3);
            num = num / 10;
        }
        if (result == originalNum) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
