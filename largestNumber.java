//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int largest = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number: ");
            n = in.nextInt();
            if (n == 0){
                break;
            }
            if (n > largest){
                largest = n;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
