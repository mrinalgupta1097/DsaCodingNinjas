package patterns;

public class BasicPattern {
    /*
    Print the following pattern for the given N number of rows.
Example:
Pattern N=3

###
###
###
     */

    public static void gameOfPattern(int n) {
        int i=1;
        while(i<=n){
            int j = 1;
           while(j<=n){ //j = 1,2,3
               System.out.print("#");
               j++;
           }
            System.out.println();
           i++;
        }

        // Write your code here
    }

    public static void main(String[] args) {
        gameOfPattern(3);
    }

}
