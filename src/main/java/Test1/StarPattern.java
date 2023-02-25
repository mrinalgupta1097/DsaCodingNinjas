package Test1;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for (int j = n; j >= 1; j--){
                if( j == i){
                    System.out.print("*");
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
