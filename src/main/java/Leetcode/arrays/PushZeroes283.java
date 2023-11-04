package Leetcode.arrays;

import java.util.stream.Stream;

public class PushZeroes283 {
    /*
    * Given an integer array nums, move all 0's to the end of it
    * while maintaining the relative order of the non-zero elements.
    * Note that you must do this in-place without making a copy of the array.
    */
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(final int num : nums){
            if( num != 0){
                nums[i] = num;
                i++;
            }
        }
        while( i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
