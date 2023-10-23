package DSA.Milestone3.recursion2;

public class ReplaceCharactersRecursively {

    public static String replaceCharacter(String input, char c1, char c2) {
        //base case
        if(input.length() == 0){
            return input;
        }
        String smallerInput = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0) == c1){
            return c2 + smallerInput;

        }else {
            return input.charAt(0) + smallerInput;
        }

    }
}
