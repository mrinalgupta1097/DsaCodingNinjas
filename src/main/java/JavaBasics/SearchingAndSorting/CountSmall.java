package JavaBasics.SearchingAndSorting;

import java.util.Arrays;

public class CountSmall {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        // step 1; initialize array to return
        int[] result = new int[n];
        // step 2: sort the array
        Arrays.sort(b);
        //step 3: iterate first array
        for (int i = 0; i < n; i++) {
            int count = binarySearch(b, a[i]);
            result[i] = count;
        }
        return result;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int count = 0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] <= target) {
                count = middle + 1;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return count;
    }

}
