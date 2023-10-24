package DSA.Milestone3.recursion2;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;

        //find pivot
        int pivotIndex = partition(input, startIndex, endIndex);

        //make recursive call with pivot index
        quickSort(input, startIndex, pivotIndex - 1);
        quickSort(input, pivotIndex + 1, endIndex);

    }

    private static int partition(int[] input, int startIndex, int endIndex) {
        //select pivot element
        int pivotElement = input[startIndex];

        //count the numbers smaller than pivot
        int smallerNumberCount = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (input[i] < pivotElement) {
                smallerNumberCount++;
            }
        }
        //int smallerNumberCount = (int) IntStream.rangeClosed(startIndex + 1, endIndex).filter(i -> input[i] < pivotElement).count();
        //shift the pivot to its appropriate place
        //first preserve the element at pivot position
        int temp = input[startIndex + smallerNumberCount];
        input[startIndex + smallerNumberCount] = pivotElement;
        input[startIndex] = temp;

        //shift elements less than pivot to left and greater than pivot to right of pivot
        int i = startIndex;
        int j = endIndex;
        while (i < j) {
            if (input[i] < pivotElement) {
                i++;
            } else if (input[j] >= pivotElement) {
                j--;
            } else {
                int temporary = input[i];
                input[i] = input[j];
                input[j] = temporary;
                i++;
                j--;
            }
        }
        return startIndex + smallerNumberCount;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 2, 5);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
