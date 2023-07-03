package DSA.Milestone2.Strings;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
	/*
        1. take 2 pointers
        2. one for unique element and other for iteration
        3. check if the next element iteration equals current
        4. if yes then shift the unique element pointer to next element
        5. append next element to output
        6. else continue
        7. return output at the end
        */
        String s = "";
        s = s + str.charAt(0);
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i+1) != str.charAt(i)){
                s += str.charAt(i+1);
            }
        }
        return s;
    }
}
