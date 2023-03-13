package Arrays;

public class ArraySum {
    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
