package DSA.Milestone3.recursion;

public class CheckArraySorted2 {
    public static boolean isArraySorted(int[] arr, int startIndex){
        if(startIndex == arr.length-1) return true;
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        return isArraySorted(arr, startIndex+1);

    }
}
