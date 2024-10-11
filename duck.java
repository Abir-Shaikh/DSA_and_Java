//Input any number and check whether the number is a duck number or not

import java.util.Scanner;
public class duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,p=1,d;
        n=sc.nextInt();
        m=n;
        while(m>0){
            d=m%10;
            p=p*d;
            m=m/10;
        }
        if (p==0){
            System.out.println("duck no.");
        }else{
            System.out.println("not a duck no.");
        }
    }
}
