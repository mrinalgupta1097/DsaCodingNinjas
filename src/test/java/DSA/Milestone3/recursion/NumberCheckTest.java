package DSA.Milestone3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckTest {

    @Test
    void checkNumber_match() {
        int[] arr = {1,2,3,4,5,6,7};
        assertEquals(true, NumberCheck.checkNumber(arr, 4));
    }

    @Test
    void checkNumber_notMatch() {
        int[] arr = {1,2,3,4};
        assertEquals(false, NumberCheck.checkNumber(arr, 5));
    }
    @Test
    void checkNumber_Match_Length1() {
        int[] arr = {1};
        assertEquals(true, NumberCheck.checkNumber(arr,1));
    }
}