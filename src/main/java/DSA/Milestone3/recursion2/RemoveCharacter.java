package DSA.Milestone3.recursion2;

public class RemoveCharacter {
    //remove every occurrence of a particular character
    public static String removeX(String input){
        //base case: input empty return
        if(input.length() == 0){
            return input;
        }
        return (input.charAt(0) == 'x') ? removeX(input.substring(1)) : input.charAt(0) + removeX(input.substring(1));

    }
}
