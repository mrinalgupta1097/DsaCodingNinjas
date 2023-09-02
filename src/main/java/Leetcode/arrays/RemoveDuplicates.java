package Leetcode.arrays;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int uniqueElement = 1;
        for (int i =1; i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueElement] = nums[i];
                uniqueElement++;
            }
        }
        
       return uniqueElement;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}
