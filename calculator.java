// Simple Calculator app
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Please enter a Operator: ");
            char op = in.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Please enter Two number: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (op != 0){
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                } else if (op == 'x' || op == 'X') {
                    break;
                }
                else {
                    System.out.println("Error");
                }
                System.out.println(ans);

            }
        }
    }
}
