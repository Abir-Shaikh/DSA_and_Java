//Write a program to Check whether a character is a vowel or consonant using switch statement

import java.util.Scanner;
public class vowelSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = sc.nextLine();
        switch (word) {
            case "a":
            case "A":
                System.out.println("Vowel");
                break;

            case "e":
            case "E":
                System.out.println("Vowel");
                break;

            case "i":
            case "I":
                System.out.println("Vowel");
                break;

            case "o":
            case "O":
                System.out.println("Vowel");
                break;

            case "u":
            case "U":
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
                break;
        }
    }
}
