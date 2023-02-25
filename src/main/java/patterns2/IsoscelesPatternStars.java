package patterns2;

import java.util.Scanner;

public class IsoscelesPatternStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            int spaces = 1;
            int number = 1;
            // loop for spaces
            while (spaces <= n - row) {
                System.out.print(" ");
                spaces++;
            }
            //loop for increasing numbers
            while (number <= row) {
                System.out.print("*");
                number++;
            }
            // loop for decreasing numbers
            int decreasingNumber = row-1;
            while(decreasingNumber >= 1 ){
                System.out.print("*");
                decreasingNumber--;
            }
            System.out.println();
            row++;
        }
    }
}
