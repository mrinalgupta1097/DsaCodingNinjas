package JavaBasics.Test1;

import java.util.Scanner;

public class YetAnotherPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        YetAnotherPattern.ninjaPuzzle(n);
    }
    public static void ninjaPuzzle(int n) {
        for(int i = 1; i <= n; i++){
            // for space
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }

            // for star
            for(int k = i ; k <= n; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
