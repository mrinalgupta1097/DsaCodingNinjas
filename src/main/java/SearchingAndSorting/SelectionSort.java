package SearchingAndSorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // in every iteration find minimum elemnt
            int currentMinimumIndex = findMinimumElement(i, arr);
            //and swap with current index element
            swap(i, currentMinimumIndex, arr);
        }
    }

    private static void swap(int ele, int currentMinimum, int[] arr) {
        // function to swap
        int temp = ele;
        arr[ele] = arr[currentMinimum];
        arr[currentMinimum] = arr[temp];
    }

    private static int findMinimumElement(int i, int[] arr) {
        //function to find minimum element
        int currentMinimumIndex = 0;
        for (int j = i + 1; j < arr.length-1; j++) {
            if (arr[j] < arr[currentMinimumIndex]) {
                currentMinimumIndex = j;
            }
        }
        return currentMinimumIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 0, 9, 4 };
        selectionSort(arr);
    }
}
