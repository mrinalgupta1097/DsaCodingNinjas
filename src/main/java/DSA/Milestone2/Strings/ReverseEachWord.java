package DSA.Milestone2.Strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        //create String Builder object for output
        StringBuilder output = new StringBuilder();
        //split the String by  spaces
        String[] strArray = str.split(" ");
        //iterate over String Array
        int arrLength = strArray.length;
        for(int i = 0; i < arrLength; i++){
            // reverse the element
            String reversedWord = new StringBuilder(strArray[i]).reverse().toString();
            if(i == (strArray.length-1)){
                //if the element is last don't add the space
                output.append(reversedWord);
            }else {
                //else append the last element to output and add a space after it
                output.append(reversedWord);
                output.append(" ");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("coding ninjas"));
    }
}
