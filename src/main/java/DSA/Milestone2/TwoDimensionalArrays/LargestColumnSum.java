package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestColumnSum {
    public static Integer findLargestColumnSum(int[][] input) {
        int largestSum = Integer.MIN_VALUE;
        for (int[] ints : input) {
            Integer currentSum = Arrays.stream(ints).boxed().mapToInt(Integer::valueOf).sum();
            largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
    }
}
