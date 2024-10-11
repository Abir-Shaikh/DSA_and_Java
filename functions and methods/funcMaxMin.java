//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;
public class funcMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int n1 = scanner.nextInt();
        System.out.print("Enter Number 2 :");
        int n2 = scanner.nextInt();
        System.out.print("Enter Number 3 :");
        int n3 = scanner.nextInt();
        int max,min;
        if (n1>n2 && n1>n3){
            max = n1;
        }else if (n2>n1 && n2>n3){
            max = n2;
        }else{
            max = n3;
        }
        if (n1<n2 && n1<n3){
            min = n1;
        }else if (n2<n1 && n2<n3){
        min = n2;
    }else{
        min = n3;
        }
        System.out.print("Maximum number : " + max);
        System.out.print("Minimum number : " + min);
    }
}
