package DSA.Milestone3.recursion;

public class LastIndexOfElement {
    public static int lastIndex(int input[], int x) {
        return recursiveLinearSearch(input, x, input.length-1);
    }
    private static int recursiveLinearSearch(int[] input, int target, int startIndex) {
        return (startIndex < 0) ? -1 : (input[startIndex] == target) ? startIndex : recursiveLinearSearch(input, target, startIndex - 1);
    }
}
