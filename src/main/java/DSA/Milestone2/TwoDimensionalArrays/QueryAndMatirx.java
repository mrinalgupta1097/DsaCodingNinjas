package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Arrays;

public class QueryAndMatirx {
    public static int[] query(int[][] mat, int m, int n, String[] q) {
        // Write your code here.
        int k = 0;

        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';
            if (queryType == 2) {
                k++;
            }
        }
        int[] result = new int[k];
        int j = 0;
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';
            char dimension = query.charAt(1);
            int index = query.charAt(2) - '0';

            if (queryType == '1') {
                if (dimension == 'R') {
                    flipRow(mat, index, n);
                } else if (dimension == 'C') {
                    flipColumn(mat, index, m);
                }
            } else if (queryType == '2') {
                int count = 0;
                if (dimension == 'R') {
                    count = countZeroesInRow(mat, index, n);
                } else if (dimension == 'C') {
                    count = countZerosInColumn(mat, index, m);
                }
                result[j] = count;
                j++;
            }
        }
        return result;
    }

    //function to flip a row
    static void flipRow(int[][] matrix, int rowIndex, int totalColumns) {
        for (int i = 0; i < totalColumns; i++) {
            matrix[rowIndex][i] = 1 - matrix[rowIndex][i];
        }
    }

    //function to flip a column
    static void flipColumn(int[][] matrix, int columnIndex, int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            matrix[i][columnIndex] = 1 - matrix[i][columnIndex];
        }
    }

    // function to count zeros in a row
    static int countZeroesInRow(int[][] matrix, int rowIndex, int totalColumns) {
        int count = 0;
        for (int j = 0; j < totalColumns; j++) {
            if (matrix[rowIndex][j] == 0) {
                count++;
            }
        }
        return count;
    }

    //function to count zeroes in column
    static int countZerosInColumn(int[][] matrix, int colIndex, int totalRows) {
        int count = 0;
        for (int i = 0; i < totalRows; i++) {
            if (matrix[i][colIndex] == 0) {
                count++;
            }
        }
        return count;
    }
}