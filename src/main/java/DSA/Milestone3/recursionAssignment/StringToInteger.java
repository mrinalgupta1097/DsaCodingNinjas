package DSA.Milestone3.recursionAssignment;

public class StringToInteger {
    public static int convertStringToInt(String input) {
        // Write your code here
        return stringToIntegerHelper(input, 0, 0);


    }

    public static int stringToIntegerHelper(String str, int index, int currentresult) {
        if (index == str.length()) {
            return currentresult; // Base case: Reached the end of the string
        }

        int digit = str.charAt(index) - '0'; // Convert character to integer

        // Recursively build the integer
        currentresult = currentresult * 10 + digit;

        return stringToIntegerHelper(str, index + 1, currentresult);
    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt("123"));
    }
}
