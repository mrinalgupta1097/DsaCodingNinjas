package DSA.Milestone3.timecomplexity;

public class RotateArrayLeft {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        if (arr.length == 0 || d == 0) {
            // No need to rotate an empty array or if the number of positions is 0
            return;
        }
        int length = arr.length;
        d = d % length;
        reverse(arr, 0, length - 1);
        reverse(arr, 0, length - d - 1);
        reverse(arr, length - d, length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
