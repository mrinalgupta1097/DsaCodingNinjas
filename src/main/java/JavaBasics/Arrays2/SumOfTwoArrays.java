package JavaBasics.Arrays2;

public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        /*
         * there are 2 important things 2 notice here
         * 1. sum array will be of size max(arr1, arr2) +1
         * 2. traverse the longest array
         *
         */
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int k = Math.max(arr1.length, arr2.length);
        int carry = 0;
        while (i >= 0 && j >= 0) {
            //sum = arr1 element + arr2 element + carry
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        // if arr1 is longer
        while (i >= 0) {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        //if arr2 is longer
        while (j >= 0) {
            int sum = arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        output[0] = carry;
    }
}
