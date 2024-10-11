//Perimeter Of Circle

import java.util.Scanner;
public class perimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextInt();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
