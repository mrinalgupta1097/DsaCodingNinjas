package DSA.Milestone3.recursion;

public class PrintNumbers {
    public static void print(int n) {
        if (n == 1) {
            System.out.print(1);
        } else {
            print(n - 1);
            System.out.print(" " + n);
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
