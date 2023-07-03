package JavaBasics.basics.patterns;

public class AlphabetPattern {
    public static void gameOfAlphabet(int n) {
        // Write your code here
        int i = 1;
        int alphabet = 64;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print((char) (alphabet + j) + " ");
                j++;
            }
            System.out.println();
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        gameOfAlphabet(3);
    }
}
