package ForLoop;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        if(number <= 1){
            System.out.println(number);
        }
        while (i <=number) {
            if((i*i) > number){
                System.out.println(i-1);
                break;
            }
            i++;
        }
    }
}
