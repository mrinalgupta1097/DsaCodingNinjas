package DSA.Milestone3.recursion;

public class FibonacciNumber {

    public static int fibonacciNumber(int n){
        return (n==1) ? 1: fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}
