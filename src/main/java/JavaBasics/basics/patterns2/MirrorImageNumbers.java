package JavaBasics.basics.patterns2;

import java.util.Scanner;

public class MirrorImageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            int number = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            while (number <= i) {
                System.out.print(number);
                number++;
            }
            System.out.println();
            i++;
        }
    }
}
