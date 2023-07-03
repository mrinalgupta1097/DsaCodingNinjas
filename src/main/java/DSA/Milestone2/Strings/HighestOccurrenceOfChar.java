package DSA.Milestone2.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HighestOccurrenceOfChar {
    public static char highestOccuringChar(String str) {
        //create a hashmap: key-> char, value-> occurrence
        Map<Character, Integer> charOcc = new TreeMap<>();
        int maxOcc = 0;
        char key = '!';
        // iterate over string and insert values in map
        for (char ch :
                str.toCharArray()) {
            charOcc.compute(ch, (k, v) -> (v == null) ? 1 : v++);
        }
       return 'c';

    }
}
