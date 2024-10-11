//Write a program to read gender and print the corresponding gender using switch statement

import java.util.Scanner;
public class gendersSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender;
        System.out.print("Enter the gender (M/F): ");
        gender = sc.next().charAt(0);

        switch (gender){
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid gender");
                break;
        }
    }
}
