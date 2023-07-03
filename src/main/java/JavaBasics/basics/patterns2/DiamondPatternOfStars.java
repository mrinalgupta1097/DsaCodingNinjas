package JavaBasics.basics.patterns2;

import java.util.Scanner;

public class DiamondPatternOfStars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int n1=n/2+1; // no of rows in upper half
        int n2=n-n1; // no of rows in lower half
        // printing upper half
        for(int i=1;i<=n1;i++) {

            for(int space=1;space<=(n1-i);space++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // printing lower half
        int k=n2-1;
        for(int i=1;i<=n2;i++) {
            for(int space=1;space<=i;space++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*k+1);j++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }

        int a = 42;
        int b = ~a; //(there is tilde sign before a)
        System.out.print(a + " " + b);


    }
}
