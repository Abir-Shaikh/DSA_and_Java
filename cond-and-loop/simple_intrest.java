//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class simple_intrest {
    public static void main(String[] args) {
        float p,r,t,si;
        p = 18990;
        r = 50;
        t = 2;
        si = (p * r * t)/100 ;
        System.out.println(si);
    }
}
