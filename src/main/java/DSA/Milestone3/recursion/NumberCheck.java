package DSA.Milestone3.recursion;

public class NumberCheck {
    public static boolean checkNumber(int input[], int x) {
        if (input[0] == x) {
            return true;
        }
        if (input.length == 1) {
            return false;
        }
        int[] smallArray = new int[input.length - 1];
        System.arraycopy(input, 1, smallArray, 0, input.length - 1);
        return checkNumber(smallArray, x);

    }
}
