package DSA.Milestone2.Arrays;

public class Sort01 {
    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int n = arr.length;
        int left = 0, right = n - 1;
        for (int i = 0; i <= right; i++) {
            if (arr[i] == 0) {
                swap(arr, i, left);
                left++;
            } else if (arr[i] == 1) {
                swap(arr, i, right);
                right--;
                i--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
