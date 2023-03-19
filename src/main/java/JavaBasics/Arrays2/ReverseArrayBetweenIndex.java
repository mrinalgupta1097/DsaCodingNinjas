package JavaBasics.Arrays2;

public class ReverseArrayBetweenIndex {
    public static int[] reverseBetween(int n, int l, int r, int[] arr) {
        //using two pointers approach
        int left = l;
        int right = r;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
