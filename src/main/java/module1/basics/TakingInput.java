package module1.basics;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int marks1 = s.nextInt();
        int marks2 = s.nextInt();
        int marks3 = s.nextInt();
        System.out.println(name);
        System.out.println((marks1+marks2+marks3)/3);


    }

}

