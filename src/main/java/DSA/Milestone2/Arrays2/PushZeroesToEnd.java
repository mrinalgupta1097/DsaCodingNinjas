package DSA.Milestone2.Arrays2;

public class PushZeroesToEnd {
    // push all the non zeroes to end of an array without changing the order of non-zero elements
    public static void pushZeroes(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }

    }

    // improvement for less memory; since the one value will always be zero
    // we can set it directly no need of temp
    public static void pushZeroesLessMemory(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[i++] = num;
            }
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
        System.gc();
    }

}
