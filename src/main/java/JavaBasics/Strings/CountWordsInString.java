package JavaBasics.Strings;

public class CountWordsInString {
    public static int countWords(String str) {
        return (str.length() == 0) ? 0 : (str.split(" ")).length;
    }
}
