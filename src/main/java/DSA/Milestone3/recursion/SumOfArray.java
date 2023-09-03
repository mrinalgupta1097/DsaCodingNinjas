package DSA.Milestone3.recursion;

public class SumOfArray {
    public static int sum(int input[]) {
        if(input.length ==1){
            return input[0];
        }
        int[] smallArray = new int[input.length-1];
        System.arraycopy(input, 1, smallArray, 0,input.length-1);
        return input[0] + sum(smallArray);
    }
}
