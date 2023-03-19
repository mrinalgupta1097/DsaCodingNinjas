package TopQuestions.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeftRotationsOfArray {
    public static List<ArrayList<Integer>> leftRotationsOfArray(List<Integer> nums, List<Integer> queries) {
        //Step 1: create a list of list to return
        List<ArrayList<Integer>> result = new ArrayList<>();
        //step 2: iterate through queries array to perform every rotation
        for (Integer query : queries) {
            //step 3: find the actual rotations needed
            int rotationNeeded = query % nums.size();
            //step 4:r rotate array
            List<Integer> newList = new ArrayList<>(nums);
            Collections.rotate(newList, -rotationNeeded);
            result.add((ArrayList<Integer>) newList);
        }
        // step : return the resultant array
        return result;

    }

    // method to rotate the array


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(8);
        nums.add(6);
        nums.add(1);
        nums.add(2);
        List<Integer> queries = new ArrayList<>();
        queries.add(8);
        queries.add(4);
        queries.add(3);
        System.out.println(leftRotationsOfArray(nums, queries));


    }
}
