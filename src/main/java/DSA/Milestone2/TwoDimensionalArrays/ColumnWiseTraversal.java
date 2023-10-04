package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;

public class ColumnWiseTraversal {
    public static int[] printColWise(int [][]a) {
        int rows = a.length;
        int column = a[0].length;
        int[] result = new int[rows * column];
        int index = 0;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                result[index++] = a[j][i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        Arrays.stream(ColumnWiseTraversal.printColWise(a)).forEach(System.out::println);
    }
}
