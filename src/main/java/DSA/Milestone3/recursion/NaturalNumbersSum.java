package DSA.Milestone3.recursion;

public class NaturalNumbersSum {
    public static int sum(int n) {
        return (n == 1) ? 1 : (n + sum(n - 1));
    }
}
