package DSA.Milestone2.Strings;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurrenceOfChar {
    public static char highestOccuringChar(String str) {
        //create a hashmap to store the occurrence of characters
        Map<Character, Integer> map = new HashMap<>();
        char c = Character.MIN_VALUE;
        //iterate over string to find the occurrence count per character
        for (char ch :
                str.toCharArray()) {
            map.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        // take a temp max value;
        int maxOcc = Integer.MIN_VALUE;
        // query map to fint he key for max value
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxOcc){
                maxOcc = entry.getValue();
                c = entry.getKey();
            }
        }
        System.gc();
        return c;
    }
    public static char highestOccuringCharWithoutHashmap(String str) {
        int[] count = new int[256];
        int max = 0;
        char ch = '\0';
        for (int i = 0; i< str.length(); i++){//aa
            count[str.charAt(i)]++;
        }
        for(int i = 0; i<str.length(); i++){
            if(count[str.charAt(i)] > max){
                max = count[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        return ch;
    }



    public static void main(String[] args) {
        System.out.println(highestOccuringChar("aabbbbcdddd"));
        System.out.println(highestOccuringCharWithoutHashmap("aabbbbcdddd"));

    }
}
