package DSA.Milestone3.recursion;

public class Factorial {
    public static long factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
