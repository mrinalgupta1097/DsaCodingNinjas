package ForLoop;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        if (targetNumber < 2) {
            System.out.println(targetNumber);
        } else {
            int previousNum = 1;
            int secondPreviousNumber = 0;
            int sum = 0;
            for (int i = 2; i <= targetNumber; i++) {
                sum = previousNum + secondPreviousNumber;
                secondPreviousNumber = previousNum;
                previousNum = sum;
            }
            System.out.println(sum);
            int i = 1;
            while(i < 3) {
                int j = 0;
                while(j < 5) {
                    j++;
                    if(j == 3) {
                        continue;
                    }
                    System.out.print(j + " ");
                }
                i++;
            }
        }
    }
}
