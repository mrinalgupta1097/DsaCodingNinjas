package JavaBasics.ForLoop;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int choice = sc.nextInt();
        if (choice == 1) {
            int sum = 0;
            for (int i = 1; i < number + 1; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else if (choice == 2) {
            int product = 1;
            for (int i = 1; i < number + 1; i++) {
                product *= i;
            }
            System.out.println(product);
        } else {
            System.out.println(-1);
        }


    }
}
