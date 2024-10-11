// Write a program to print remark according to the grade obtained using switch statement

import java.util.Scanner;
public class gradeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char g;
        System.out.print("Enter grade : ");
        g=input.next().charAt(0);
        switch (g) {
            case 'A' -> System.out.println("Remark : Excellent");
            case 'B' -> System.out.println("Remark : Well Done");
            case 'C' -> System.out.println("Remark : good");
            case 'D' -> System.out.println("Remark : Better Luck next time");
            case 'F' -> System.out.println("Remark : Fail");
            default -> System.out.println("Invalid grade");
        }
        System.out.println("Grade : " + g);
    }
}
