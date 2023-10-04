package DSA.Milestone2.TwoDimensionalArrays;

public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        int rows = mat.length;
        if(rows == 0){
            return; //this we are doing for blank array.
        }
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            int rowSum = 0;
            for(int j=0;j<cols;j++){
                rowSum = rowSum + mat[i][j];
            }
            System.out.print(rowSum + " ");
        }
    }
}
