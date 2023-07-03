package JavaBasics.basics.patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {
    /*
     *4444
     *333
     *22
     *1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
