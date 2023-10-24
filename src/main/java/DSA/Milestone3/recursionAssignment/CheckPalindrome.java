package DSA.Milestone3.recursionAssignment;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        if(str.isEmpty()){
            return true;
        }
        return checkPalindrome(str, 0, str.length() -1);
    }

    private static boolean checkPalindrome(String str, int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return true;
        }
        if(str.charAt(startIndex) == str.charAt(endIndex)){
            return true;
        }
        if( startIndex < endIndex+1){
            return checkPalindrome(str, startIndex + 1, endIndex -1);
        }
        return true;
    }
}
