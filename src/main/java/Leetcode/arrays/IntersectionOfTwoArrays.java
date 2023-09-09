package Leetcode.arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        //brute force
        //initialise the new array
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        HashSet<Integer> storeElement = new HashSet<>();
        int bounds = Math.max(nums1.length, nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            storeElement.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            storeElement.add(nums2[i]);
        }

        return result;
    }
}
