package DSA.Milestone2.Strings;

public class CompressString {
    public static String getCompressedString(String str) {
        int length = str.length();

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < length; i++) {
            //if i reaches at the end of the string then append all and break the loop
            if (i == length - 1) {
                if (count == 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(str.charAt(i)).append(count);
                }
                break;
            }
            //
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        return sb.toString();
    }

    public static String compressed(String str) {
        int length = str.length();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                appendCharCount(sb, str.charAt(i), count);
                count = 1;
            }
        }

        // Handle the last character after the loop
        appendCharCount(sb, str.charAt(length - 1), count);

        return sb.toString();
    }

    private static void appendCharCount(StringBuilder sb, char ch, int count) {
        sb.append(ch);
        if (count > 1) {
            sb.append(count);
        }

    }

    public static void main(String[] args) {
        System.out.println(getCompressedString("aabbc"));
    }

}
