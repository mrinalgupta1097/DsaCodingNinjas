package Arrays2;

public class MoveNegativeNumbers {
    public static void move(int[] ar) {
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0 && i != j) {
                int t = ar[i];
                ar[i] = ar[j];
                ar[j] = t;
                j++;
            }
        }


    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 2, -7, 3,
                2, -6, -8, -9, 3};
        move(ar);
        for (int e : ar)
            System.out.print(e + " ");
    }


}
