package JavaBasics.basics.patterns;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int alphabet = 64;
        while( i <= n){
            int j = 1;
            while(j <= i){
                System.out.print((char) (alphabet + i));
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
