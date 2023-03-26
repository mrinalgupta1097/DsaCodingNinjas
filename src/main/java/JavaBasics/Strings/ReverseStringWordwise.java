package JavaBasics.Strings;

public class ReverseStringWordwise {
    public static String reverseWordWise(String input) {
        String[] strArr = input.split(" ");
        int left  = 0;
        int right = strArr.length -1;
        while(left < right){
            String temp = strArr[left];
            strArr[left++] = strArr[right];
            strArr[right--] = temp;
        }
        return String.join(" ", strArr);

    }

    public static void main(String[] args) {
        System.out.println(reverseWordWise("hello java coders"));
    }
}
