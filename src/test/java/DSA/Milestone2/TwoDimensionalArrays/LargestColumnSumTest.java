package DSA.Milestone2.TwoDimensionalArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestColumnSumTest {

    @Test
    public void checkLargestColumnSum() {
        int[][] input = {
                {1, 2, 3},
                {19, 5, 6},
                {7, 8, 9}
        };
        assertEquals(30, LargestColumnSum.findLargestColumnSum(input));
    }

}