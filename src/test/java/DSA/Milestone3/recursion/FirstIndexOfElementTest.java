package DSA.Milestone3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstIndexOfElementTest {

    @Test
    void firstIndex() {
        int[] input = {18, 47, 9, 42, 61, 73};
        assertEquals(4, FirstIndexOfElement.firstIndex(input, 61));
    }
}