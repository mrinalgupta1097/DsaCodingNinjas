package DSA.Milestone3.timecomplexity;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static int findUnique(int[] arr) {

        //create frequency map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i :
                arr) {
            frequencyMap.compute(i, (k,v) -> (v == null) ? 1 : ++v);
        }
        return frequencyMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findAny().get();
    }

    //method with O(n) and constant space -> use XOR (exclusice OR)
    public static int findUnique_ConstantTimeAndSpace(int[] arr) {

        int ans = 0;
        for (int i :
                arr) {
          ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 1, 3, 5,5};
        System.out.println(findUnique_ConstantTimeAndSpace(arr));
    }

}
