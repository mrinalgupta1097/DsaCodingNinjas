package JavaBasics.Strings;

import java.util.HashMap;
import java.util.Map;

public class PermutaionStrings {
    public static boolean isPermutation(String str1, String str2) {
        /*
        * 1. create a map
        * 2. iterate through any string
        * 3.
         */
        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++){
            Character ch = str1.charAt(i);
            map.compute(ch, (k,v) -> (v == null) ? 1 : ++v);
        }
        for (int i = 0; i < str2.length(); i++){
            Character ch = str2.charAt(i);
            map.compute(ch, (k,v) -> (v == null) ? 1 : --v);
        }
        for (Integer count :
                map.values()) {
            if(count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("coding", "cgnido"));
    }
}
