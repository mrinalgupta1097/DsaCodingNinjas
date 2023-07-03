package DSA.Milestone2.Arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementInArray {
    public static int findUnique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            map.compute(e, (k, v) ->
                    (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
