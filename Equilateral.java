//Area Of Equilateral Triangle

import java.util.Scanner;
public class Equilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = sc.nextInt();
        double area = Math.sqrt((3) * side * side)/4;
        System.out.println("Area of equilateral is: " + area);
    }
}
