package DSA.Milestone3.recursion2;

public class ReplaceCharactersInString {
    public static String replaceCharacters(String input, char a, char b){
        if(input.length() == 0){
            return input;
        }
        String smallOutput = replaceCharacters(input.substring(1), a, b);
        if(input.charAt(0) == a){
            return b + smallOutput;
        }else{
            return input.charAt(0) + smallOutput;
        }
    }
}
