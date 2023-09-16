package DSA.Milestone3.recursion;

public class FirstIndexOfElement {
    public static int firstIndex(int input[], int x) {
        return recursiveLinearSearch(input, x, 0);

    }

    private static int recursiveLinearSearch(int[] input, int target, int startIndex) {
        return (startIndex > input.length -1) ? -1 : (input[startIndex] == target) ? startIndex : recursiveLinearSearch(input, target, startIndex + 1);
    }
}
