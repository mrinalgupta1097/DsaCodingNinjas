package DSA.Milestone3.recursion;

public class CheckArraySorted {
    public static boolean isArraySorted(int[] a){
        if(a.length == 1){
            return true;
        }
        if(a[0] > a[1]){
            return false;
        }
        int[] smallArray = new int[a.length -1];
        System.arraycopy(a, 1, smallArray, 0, a.length - 1);
        return isArraySorted(smallArray);
    }
}
