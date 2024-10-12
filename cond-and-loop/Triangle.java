//Area of a triangle 1/2(b*h)

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        int area = (base * height) / 2 ;
        System.out.println("The area of the triangle is " + area);
    }
}


