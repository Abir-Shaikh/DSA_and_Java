//fruits search

import java.util.Scanner;
public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "apple" -> System.out.println("juicy apple");
            case "orange" -> System.out.println("round fruit");
            case "mango" -> System.out.println("king of the fruits");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
