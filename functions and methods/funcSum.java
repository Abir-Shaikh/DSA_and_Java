//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
public class funcSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = findSum(n);
        System.out.print("sum of first : " + n + " sum of natural numbers : " + sum);
    }
    public static int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
