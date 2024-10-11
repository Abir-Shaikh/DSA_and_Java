// Reverse of a number
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int num = 72367;
        int result = 0;
        while (num > 0){
            int rem = num % 10;
            num = num/10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
