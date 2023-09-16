package DSA.Milestone3.recursion2;

public class ReplacePi {
    //replace "Pi" in given string with "3.14"
    public static String replacePi(String input) {
        if (input.length() <= 1) {
            return input;
        }
        return ("Pi".equals(input.substring(0, 2))) ?
                "3.14" + replacePi(input.substring(2)) : input.charAt(0) + replacePi(input.substring(1));
    }
}
