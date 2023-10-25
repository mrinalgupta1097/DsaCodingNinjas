package DSA.Milestone3.timecomplexity;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : arr1) {
            frequencyMap.compute(num, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (int num : arr2) {
            if (frequencyMap.containsKey(num) && (frequencyMap.get(num) > 0)) {
                resultList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        resultList.stream().sorted().forEach(integer -> System.out.print(integer + " "));

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 7, 9};
        int[] arr2 = {5, 6, 1, 8, 11, 4};
        intersection(arr1, arr2);
    }


}

