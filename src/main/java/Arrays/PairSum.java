package Arrays;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static int pairSum(int arr[], int x) {
        int count = 0;
        Map<Integer,Integer> arrMap = new HashMap<>();
        for (int i : arr) {
            int comp = x - i;
            if (arrMap.containsKey(comp)) {
                count += arrMap.get(comp);
            }
            if (arrMap.containsKey(i)) {
                arrMap.put(i, arrMap.get(i) + 1);
            } else {
                arrMap.put(i, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,4,1,2,5,4};
        System.out.println(pairSum(arr, 6));
    }
}
