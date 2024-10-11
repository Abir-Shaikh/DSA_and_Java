//Area Of Rectangle Program

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The length of the rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter the Width of the rectangle:");
        int Width = sc.nextInt();
        int Area = length * Width;
        System.out.println("Area of the rectangle is " + Area);
    }
}
