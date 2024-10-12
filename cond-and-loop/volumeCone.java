//Volume of a cone

import java.sql.SQLOutput;
import java.util.Scanner;
public class volumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Cone :");
        int Radius = sc.nextInt();
        System.out.println("Enter the Height of the Cone :");
        int Height = sc.nextInt();
        double volume = (Math.PI * Radius * Radius * Height)/3;
        System.out.println("The Volume of the Cone is " + volume);
    }
}
