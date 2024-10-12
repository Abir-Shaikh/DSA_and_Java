//Area Of Parallelogram

import java.util.Scanner;
public class parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base:");
        int Base = sc.nextInt();
        System.out.print("Enter the Height:");
        int Height = sc.nextInt();
        int area = Base *  Height;
        System.out.println("The area of the parallelogram is " + area);
    }
}
