package Arrays2;

public class RotateArray {
    public static int[] rotateArray(int[] a, int x, String dir) {
        // Write your code here.
        x = x % a.length;

        if (dir.equals("RIGHT")) {
            reverse(a, 0, a.length - 1);
            reverse(a, 0, x - 1);
            reverse(a, x, a.length - 1);
        } else if (dir.equals("LEFT")) {
            reverse(a, 0, a.length - 1);
            reverse(a, 0, a.length - x - 1);
            reverse(a, a.length - x, a.length - 1);
        }

        return a;
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] ar = {20,6,8,68,61};
        rotateArray(ar, 6, "LEFT");
        for (int e : ar)
            System.out.print(e + " ");
    }
}
