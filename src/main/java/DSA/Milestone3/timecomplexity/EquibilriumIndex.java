package DSA.Milestone3.timecomplexity;

public class EquibilriumIndex {
    public static int arrayEquilibriumIndex(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }
        int leftSum = arr[0];
        int rightSum = 0;
        //calculate right sum
        for (int i = 2; i < arr.length; i++) {
            rightSum += arr[i];
        }

        //check for equilibrium index
        for (int j = 1; j < arr.length - 1; j++) {
            if (leftSum == rightSum) {
                return j;
            } else {
                rightSum -= arr[j + 1];
                leftSum = leftSum + arr[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 1, 1, 1};
        System.out.println(arrayEquilibriumIndex(arr));
    }
}
