package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;

public class LargestRowOrColumnSum {
    public static void findLargest(int mat[][]) {
        int largestRowSum = Integer.MIN_VALUE;
        int largestColumnSum = Integer.MIN_VALUE;
        int columnIndex = -1;
        int rowIndex = -1;

        //empty array
        if (mat.length == 0) {
            System.out.println("row" + " " + 0 + " " + largestRowSum);
            return;
        }

        //row sum
        for (int i = 0; i < mat.length; i++) {
            Integer currentSum = Arrays.stream(mat[i]).boxed().mapToInt(Integer::valueOf).sum();
            if (currentSum > largestRowSum) {
                rowIndex = i;
                largestRowSum = currentSum;
            }
        }

        // column sum
        int columns = mat[0].length;
        for (int i = 0; i < columns; i++) {
            int currentSum = 0;
            for (int[] ints : mat) {
                currentSum += ints[i];
            }
            if (currentSum > largestColumnSum) {
                columnIndex = i;
                largestColumnSum = currentSum;
            }
        }
        if (largestRowSum == largestColumnSum) {
            System.out.println("row " + rowIndex + " " + largestRowSum);
        } else if (largestRowSum > largestColumnSum) {
            System.out.println("row" + " " + rowIndex + " " + largestColumnSum);
        } else {
            System.out.println("column" + " " + columnIndex + " " + largestColumnSum);
        }

    }
}
