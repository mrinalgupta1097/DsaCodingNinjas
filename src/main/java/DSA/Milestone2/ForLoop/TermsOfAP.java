package DSA.Milestone2.ForLoop;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //loop till you get n terms
        int i =1;
        int count = 1;
        while(count <=n){
            int term = (3 * i) + 2;
            if ((term % 4) != 0){
                System.out.print(term + " ");
                count++;
            }
            i++;
        }
    }
}
