//Perimeter Of Parallelogram

import java.util.Scanner;
public class perimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side :");
        int side = sc.nextInt();
        System.out.print("Enter the Base :");
        int base = sc.nextInt();
        int area = 2 * (base + side);
        System.out.println("The area of the perimeter is " + area);
    }
}
