//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner is written for taking a input in java
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
