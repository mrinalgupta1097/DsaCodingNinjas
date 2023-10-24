package DSA.Milestone3.recursionAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeomatricSumTest {

    @Test
    void geomatricSum_Success() {
        GeomatricSum.findGeometricSum(0);
        assertEquals(1, GeomatricSum.findGeometricSum(0));
        assertEquals(1.9375, GeomatricSum.findGeometricSum(4));
    }
}