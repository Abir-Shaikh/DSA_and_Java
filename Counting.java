//Counting User given Numbers
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        int n = 45536;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
