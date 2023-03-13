package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void intersections(int[] arr1, int[] arr2) {
        // {1,2,3,4,5},{2,6,5,7,2}
        Set<Integer> set1 = new HashSet<>();
        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (set1.contains(j)) {
                    continue;
                }
                if (k == arr2[j]) {
                    set1.add(j);
                    System.out.print(k);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1,1,1,1,1};
        intersections(arr1, arr2);
    }
}
