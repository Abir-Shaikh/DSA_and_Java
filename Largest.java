//Largest Number

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int max = n1;
        if (n2 > n1) {
            max = n2;
        }
        if (n3 > n2) {
            max = n3;
        }

        System.out.println(max);
    }
}
