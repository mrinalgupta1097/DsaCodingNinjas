package DSA.Milestone2.Arrays;

import java.util.HashSet;

public class TripleSum {
    public static int findTriplet(int[] arr, int x) {
        //Your code goes here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] +arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int findTripletOptimised(int[] arr, int x) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            // Use a HashSet to store pairs of elements
            HashSet<Integer> set = new HashSet<>();

            int targetSum = x - arr[i];

            for (int j = i + 1; j < n; j++) {
                int complement = targetSum - arr[j];

                // Check if the complement exists in the set

            if (set.contains(complement)) {
                    count++;
                }

                // Add the current element to the set
                set.add(arr[j]);
            }
        }

        return count;
    }
}
