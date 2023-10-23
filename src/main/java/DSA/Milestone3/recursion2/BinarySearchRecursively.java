package DSA.Milestone3.recursion2;

public class BinarySearchRecursively {
    public static int recursiveBinarySearch(int[] arr, int startIndex, int endIndex, int target) {
        if (startIndex > endIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex) / 2;
        if (target == arr[midIndex]) {
            return midIndex;
        } else if (target > arr[midIndex]) {
            return recursiveBinarySearch(arr, midIndex + 1, endIndex, target);
        } else {
            return recursiveBinarySearch(arr, startIndex, midIndex - 1, target);
        }
    }
}
