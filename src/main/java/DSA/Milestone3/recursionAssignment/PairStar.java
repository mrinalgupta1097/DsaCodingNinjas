package DSA.Milestone3.recursionAssignment;

public class PairStar {
    public static String addStars(String s) {
        // Write your code here
        if (s.length() <= 1) {
            return s; // Base case: If the string has 0 or 1 character, no separation needed
        } else {
            char firstChar = s.charAt(0);
            char secondChar = s.charAt(1);

            if (firstChar == secondChar) {
                return firstChar + "*" + addStars(s.substring(1));
            } else {
                return firstChar + addStars(s.substring(1));
            }
        }

    }
}
