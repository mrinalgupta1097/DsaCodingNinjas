package TopQuestions.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryArrayRotations {
    public static ArrayList<Integer> sortBinaryArray(ArrayList<Integer> arr, int n) {
        //	Write your code here.
        int j = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 0){
                Collections.swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(0);
        System.out.println(sortBinaryArray(list, 8));
    }
}
