package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;

public class RowWiseTraversal {
    public static int[] printRowWise(int[][] a) {
        int rows = a.length;
        int columns = a[0].length;
        int[] result = new int[rows * columns];
        int index = 0;
        for (int[] ints : a) {
            for (int j = 0; j < columns; j++) {
                result[index++] = ints[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        Arrays.stream(RowWiseTraversal.printRowWise(a)).forEach(System.out::println);
    }
}
