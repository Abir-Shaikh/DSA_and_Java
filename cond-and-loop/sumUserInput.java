//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class sumUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = 0;

        while ( true ){
            System.out.print("Enter an integer: ");
            x = in.nextInt();
            if ( x == 0 ){
                break;
            }
            sum = sum + x;
        }
        System.out.println("The sum is: " + sum);
    }
}

