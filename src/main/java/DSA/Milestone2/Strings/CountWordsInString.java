package DSA.Milestone2.Strings;

public class CountWordsInString {
    public static int countWords(String str) {
        return (str.isEmpty()) ? 0 : (str.split(" ")).length;
    }
}
