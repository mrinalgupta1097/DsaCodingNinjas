package JavaBasics.ForLoop;

import java.util.Scanner;

public class CheckSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pre = scan.nextInt();
        int i = 1;
        boolean isDec = true;
        int count = 0;
        while (i <= n - 1) {
            int curr = scan.nextInt();
            if (pre == curr) {
                System.out.println(false);
                return;
            } else if (pre < curr) {
                if (isDec) {
                    count++;
                    isDec = false;
                }

            } else {
                if (!isDec) {
                    System.out.println(false);
                    return;
                }
            }
            i++;
            pre = curr;
        }
        System.out.println(count == 1 || count == 0);
    }
}
