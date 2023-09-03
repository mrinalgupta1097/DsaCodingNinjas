package DSA.Milestone3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaturalNumbersSumTest {

    @Test
    void sumTest() {
        assertEquals(3240, NaturalNumbersSum.sum(80));
        assertEquals(1, NaturalNumbersSum.sum(1));

    }
}