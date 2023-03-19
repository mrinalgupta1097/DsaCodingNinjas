package TopQuestions.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class KLargestElements {
    public static int[] Klargest(int[] a, int k, int n) {
        // create a new array to return
        int[] kLargestArray = new int[k];
        // sort the array in ascending order and return last 2 elements
        Arrays.sort(a);
        int j = 0;
        for(int i = a.length-k; i < a.length; i++){
            kLargestArray[j] = a[i];
            j++;
        }
        return  kLargestArray;
    }
}
