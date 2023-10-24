package DSA.Milestone3.recursionAssignment;

public class GeomatricSum {
    public static double findGeometricSum(int k){
        //base case
        if( k == 0) return 1;
        return findGeometricSum(k-1) + ( 1 / (Math.pow(2, k)));

    }
}
