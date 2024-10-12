//uppercase Lowercase
import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
         char ch = in.next().charAt(0);

         if (ch >= 'a' && ch<='z'){
             System.out.println("Lowercase");
         }
         else{
             System.out.println("Uppercase");
         }
    }
}
