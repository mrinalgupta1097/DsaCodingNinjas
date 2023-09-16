package DSA.Milestone3.recursion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacePiTest {

    @Test
    void replacePi() {
        assertEquals("jenkins", ReplacePi.replacePi("jenkins"));
        assertEquals("3.14thon", ReplacePi.replacePi("Pithon"));
        assertEquals("char3.14", ReplacePi.replacePi("charPi"));
    }
}