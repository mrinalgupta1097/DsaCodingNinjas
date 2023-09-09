package Leetcode.recursion;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        return isPowerOfTwo(n/2);
    }
}
