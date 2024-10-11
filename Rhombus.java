//Area Of rhombus

import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 1st Diagoal :");
        int a = sc.nextInt();
        System.out.print("Enter The 2nd Diagoal :");
        int b = sc.nextInt();
        int area = (a * b) / 2;
        System.out.println("The area of the diagonal is: " + area);
    }
}
