package ForLoop;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        if(range == 2){
            System.out.println(range);
        }else{
            for(int i = 2; i <=range; i++){

                for(int j = 2; j <= i; j++){
                    if(i ==2){
                        System.out.println(i);
                        continue;
                    }
                    if(i % j != 0){
                        continue;
                    }
                }
            }
        }
    }
}
