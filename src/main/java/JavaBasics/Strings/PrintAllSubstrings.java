package JavaBasics.Strings;

public class PrintAllSubstrings {

    public static void printSubstrings(String str) {
        //for iteration
        for(int i = 0; i < str.length(); i++){
            // for selection of ending point
            for(int j = i; j <= str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        printSubstrings("pqrs");
    }
}
