package JavaBasics.Strings;

public class RemoveOccurrenceOfCharacter {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String output = "";
        for (char c :
                str.toCharArray()) {
            if(ch != c){
                output+= c;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(removeAllOccurrencesOfChar("coding ninjas", 'n'));

    }
}
