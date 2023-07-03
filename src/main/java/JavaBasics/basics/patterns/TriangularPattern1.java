package JavaBasics.basics.patterns;

public class TriangularPattern1 {
    public static void trianglePattern(int n) {
        // Write your code here
        int i = 1;
        while(i <= n){ // i = 1
            int j = n; // j=5
            while(j <= i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
