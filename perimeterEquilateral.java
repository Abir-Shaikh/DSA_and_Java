//Perimeter Of Equilateral Triangle

import java.util.Scanner;
public class perimeterEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = sc.nextInt();
        int perimeter = 3 * side ;
        System.out.println("The perimeter of " + side + " is " + perimeter);
    }
}
