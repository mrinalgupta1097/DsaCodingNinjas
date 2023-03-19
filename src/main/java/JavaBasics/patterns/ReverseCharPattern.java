package JavaBasics.patterns;

public class ReverseCharPattern {
    /*
     *E
     *ED
     *EDC
     *EDCB
     *EDCBA
     */
    public static void alphabetPattern(int n) {
        // Write your code here
        int i = n;
        int alphabet = 64 + n; //
        while (i >= 1) { //i=5
            int j = n;
            int k = i;
            while (j >= i) {
                System.out.print((char) (alphabet + (k--)- i));
                j--;
            }
            System.out.println();
            i--;
        }

    }

    public static void main(String[] args) {
        alphabetPattern(5);
    }
}
