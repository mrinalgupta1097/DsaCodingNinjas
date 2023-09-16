package DSA.Milestone3.recursion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceCharactersInStringTest {
    @Test
    public void replaceCharacters(){
        assertEquals("bppb", ReplaceCharactersInString.replaceCharacters("appa", 'a', 'b'));
    }

}