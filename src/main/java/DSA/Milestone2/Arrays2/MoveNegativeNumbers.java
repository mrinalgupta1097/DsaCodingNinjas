package DSA.Milestone2.Arrays2;

import java.util.Scanner;

public class MoveNegativeNumbers {
    public static void move(int[] ar) {
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0 && i != j) {
                int t = ar[i];
                ar[i] = ar[j];
                ar[j] = t;
                j++;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("YES");
        }
    }


}
