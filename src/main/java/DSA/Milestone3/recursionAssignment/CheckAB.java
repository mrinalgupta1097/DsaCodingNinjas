package DSA.Milestone3.recursionAssignment;

public class CheckAB {
    public static boolean checkAB(String input) {
        // base case
        int len = input.length();

        if (len == 0) {
            return true;
        }

        boolean smallAns = false;

        //take all cases one by one
        if (len == 1) {
            if (input.charAt(0) == 'a') {
                smallAns = true;
                input = input.substring(1, len);
            }

        } else {
            boolean aConditon = input.charAt(0) == 'a' && input.charAt(1) == 'a';
            if (len == 2) {
                if (aConditon) {
                    smallAns = true;
                    input = input.substring(2, len);
                }
            } else {
                if (input.charAt(0) == 'a' && input.startsWith("bb", 1)) {
                    smallAns = true;
                    input = input.substring(3, len);
                } else if (aConditon) {
                    smallAns = true;
                    input = input.substring(1, len);
                }
            }
        }

        return smallAns && checkAB(input);

    }
}
