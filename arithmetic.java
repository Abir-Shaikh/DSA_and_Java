//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int m = sc.nextInt();//m = multiplicataion
        System.out.println("Enter number : ");
        int s = sc.nextInt();//s = sum
        System.out.println("Enter number : ");
        int n = sc.nextInt();//n = subtraction
        int op = ( m * m + s + s ) - n;
        System.out.println(op);

    }
}
