package DSA.Milestone2.ForLoop;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long powerOfTen = 0;
        long binaryNumber = 0;
        while (number > 0) {
            int lastDigit = number % 2;
            binaryNumber =  binaryNumber + lastDigit * (long)Math.pow(10, powerOfTen++);
            number = number / 2;
        }
        System.out.println(binaryNumber);
    }
}
