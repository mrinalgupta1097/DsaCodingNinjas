package DSA.Milestone3.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        assertEquals(24, Factorial.factorial(4));
        assertEquals(1,Factorial.factorial(0));
        assertEquals(1,Factorial.factorial(0));
    }
}