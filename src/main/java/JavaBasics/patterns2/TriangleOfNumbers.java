package JavaBasics.patterns2;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            int number = 1;
            // loop for spaces
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            //loop for increasing numbers
            int k = i;
            while (number <= i) {
                System.out.print(k++);
                number++;
            }
            // loop for decreasing numbers
            k=k-2;
            int decreasingNumber = i -1;
            while(decreasingNumber >= 1 ){
                System.out.print(k--);
                decreasingNumber--;
            }
            System.out.println();
            i++;
        }
    }
}
