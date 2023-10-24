package DSA.Milestone3.recursionAssignment;

public class MultiplicationIntegers {
    public static int multiplyTwoIntegers(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (n == 1) {
            return m;
        }

        int smallerOutput = multiplyTwoIntegers(m, n - 1);
        return smallerOutput + m;


    }
}
