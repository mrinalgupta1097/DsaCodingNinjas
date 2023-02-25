package ForLoop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int powerOfTwo = 0;
        int decimalNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == 1) {
                decimalNumber = (int) (decimalNumber + (lastDigit * Math.pow(2, powerOfTwo)));
            }
            number = number / 10;
            powerOfTwo++;
        }
        System.out.println(decimalNumber);
    }
}
