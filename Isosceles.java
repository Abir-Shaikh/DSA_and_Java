//Area of a isosceles Triangle

import java.util.Scanner;
public class Isosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base :");
        int base = sc.nextInt();
        System.out.print("Enter the height :");
        int height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("The area of the isosceles is " + area);
    }
}
