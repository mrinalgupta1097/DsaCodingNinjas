package DSA.Milestone2.Arrays;

public class ArrangeElementsInArray {
    public static void arrange(int[] arr, int n) {
        // Step 1: initiate array
        // step 2 : take two pointers
        int left = 0;
        int right = n - 1;
        int counter = 1;

        // step 3 : populate array
        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left++] = counter;
            } else {
                arr[right--] = counter;
            }
            counter++;

        }
    }

    public static void main(String[] args) {
        int[] arr = null;
        arrange(arr, 1);
    }
}
