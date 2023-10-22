package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static int[][] transpose(int m, int n, int[][] mat) {
        /*
         *Transpose is rows -> columns and
         * columns -> rows
         */
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        return transpose;

    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {19, 5, 6},
                {7, 8, 9}
        };
        int[][] result = transpose(3, 3, input);
        for (int[] arr :
                result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
