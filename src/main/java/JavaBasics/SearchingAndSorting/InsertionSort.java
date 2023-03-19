package JavaBasics.SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        // iterate through array for sorted elements, first is considered as always sorted
        for (int i = 1; i < n; i++) {
            int j = i;
            while((j > 0) && (arr[j] < arr[j-1])){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }




    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 0, 9, 4 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
