package DSA.Milestone3.recursionAssignment;

public class SumOfDigits {
    public static int sumOfDigits(int input){
        //base case : one digit -> sum == digit
        if((input/10) == 0){
            return input;
        }
        //smaller output
        int smallerOutput = sumOfDigits(input/10);

        return smallerOutput + (input%10);


    }
}
