package DSA.Milestone2.Arrays2;

public class SecondLargestArray {
    public static int secondLargestElement(int[] arr) {
        int lar = Integer.MIN_VALUE;;
        int sec = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length; i++){
            if (arr[i]>lar){
                sec = lar;
                lar = arr[i];
            }
            else if(arr[i]>sec && arr[i] != lar){
                sec = arr[i];
            }
        }
        return sec;

    }
}
