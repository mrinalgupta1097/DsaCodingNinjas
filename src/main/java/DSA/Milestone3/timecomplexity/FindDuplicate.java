package DSA.Milestone3.timecomplexity;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        Set<Integer> tempSet = new HashSet<>();
        for (int num :
                arr) {
            if (!tempSet.add(num)) {
                return num;
            }
        }
        return 0;
    }

    public static int findDuplicateImproved(int[] arr) {
        Set<Integer> tempSet = new HashSet<>();
        return Arrays.stream(arr)
                .boxed()
                .filter(num -> !tempSet.add(num))
                .findFirst()
                .orElse(0);

    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 5, 3};
        System.out.println(findDuplicate(arr));
    }
}
