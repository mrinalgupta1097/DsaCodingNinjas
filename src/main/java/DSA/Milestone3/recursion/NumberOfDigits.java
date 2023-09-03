package DSA.Milestone3.recursion;

public class NumberOfDigits {
    public static int countDigits(int n){
        return (n/10 == 0) ? 1 : 1 + countDigits(n/10);

    }
}
