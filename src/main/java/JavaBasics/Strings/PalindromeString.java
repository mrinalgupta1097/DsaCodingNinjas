package JavaBasics.Strings;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        //Your code goes here
        //reverse string
        StringBuilder reversedString = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            reversedString.insert(0, str.charAt(i));
        }
        return reversedString.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ram"));
    }
}
