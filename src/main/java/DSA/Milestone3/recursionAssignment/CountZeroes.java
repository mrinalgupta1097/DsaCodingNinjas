package DSA.Milestone3.recursionAssignment;

public class CountZeroes {
    public static int countZerosRec(int input){
        // Write your code here
        if(input % 10 ==  0){
            return 1 + countZerosRec(input/10);
        } else if (input/10 ==0) {
            return 0;
        }else{
            return countZerosRec(input/10);
        }

    }
}
