package Leetcode.recursion;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n/2 == 0){
            return true;
        }
        isPowerOfTwo(n/2);
        return false;
    }
}
