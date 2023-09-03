package DSA.Milestone3.recursion;

public class CalculatePower {
    public static int power(int x, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return (n==0) ? 1 : (n ==1) ? x : x * power(x, n-1);
    }
}
