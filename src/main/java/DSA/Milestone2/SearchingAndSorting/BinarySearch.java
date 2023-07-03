package DSA.Milestone2.SearchingAndSorting;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while ((endIndex - startIndex) > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (arr[midIndex] == x) {
                return midIndex;
            } else if (arr[midIndex] > x) {
                endIndex = midIndex;
            } else if (arr[midIndex] < x) {
                startIndex = midIndex;
            }else{
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10, 15, 19, 24, 28, 32, 33, 35};
        int x = 40;
        System.out.println(binarySearch(arr, x));
    }
}
