package JavaBasics.basics.patterns;

import java.util.Scanner;

public class InterestingAlphabets {
    /*
     *E
     *DE
     *CDE
     *BCDE
     *ABCDE

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int k = n -i;
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A'+ (k++)));
            }
            System.out.println();
        }

    }
}
