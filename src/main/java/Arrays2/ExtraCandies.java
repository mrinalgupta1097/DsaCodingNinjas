package Arrays2;

import java.util.Arrays;

public class ExtraCandies {
    public static int[] extraCandies(int n, int x, int[] p1, int[] p2) {
        /*

         */
        long leftOver = 0;
        int i = 0;
        int[] totalCandies = new int[p1.length];
        // iterate through array distributing candies
        while (i < p1.length && i < p2.length) {
            // check total number of candies given to house
            long sum = p1[i] + p2[i] + leftOver;
            // if total candies is greater keep maximum and pass extra to right
            if (sum > x && i != p1.length - 1) {
                // leftover should only be there if sum > target
                if (sum > x) {
                    leftOver = sum - x;
                    sum = x;
                }

                totalCandies[i] = (int) sum;

            } else if (sum > x && i == p1.length - 1) {
                // no need for leftover for the last element
                sum = x;
                totalCandies[i] = (int) sum;
            } else {
                // if one sum is lesser than the target, it means leftover is zero
                totalCandies[i] = (int) sum;
                leftOver = 0;
            }
            i++;

        }
        return totalCandies;
    }

    public static void main(String[] args) {
        int[] p1 = {22, 8, 4, 7, 5, 10};
        int[] p2 = {9, 3, 1, 6, 0, 9};
        int[] op = extraCandies(6, 17, p1, p2);
        Arrays.stream(op).forEach(System.out::println);
    }
}
