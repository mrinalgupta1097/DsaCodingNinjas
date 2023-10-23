package DSA.Milestone3.recursion2;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if(arr.length <=1){
            return;
        }
        // split the array into two
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - left.length];

        //copy elements into two subarrays
        for(int i = 0; i < arr.length/2; i++){
            left[i] = arr[i];
        }
        for(int i = arr.length/2; i < arr.length; i++){
            right[i - (arr.length/2)] = arr[i];
        }

        // call recursive merge sort
        mergeSort(left, l, r);
        mergeSort(right, l, r);

        // merge the array
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        // Compare the elements from the left and right
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 1, 7);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}
