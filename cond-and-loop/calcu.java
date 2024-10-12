//take a input of two no and print the sum using methods

import java.util.Scanner;
public class calcu {
    public static void main(String[] args) {
        calcu();
    }
    static void calcu(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = in.nextInt();

        int sum = num1 + num2;
       System.out.println("The sum = " + sum);
    }

}
