package ForLoop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // this solution will trim the leading zeroes if any in the reverse
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
