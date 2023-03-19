package JavaBasics.Test1;

public class GCD {

    public static int GCDByEuclideanAlgorithm(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(GCDByEuclideanAlgorithm(20, 15));
    }
}
