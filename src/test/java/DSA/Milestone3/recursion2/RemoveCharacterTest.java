package DSA.Milestone3.recursion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharacterTest {

    @Test
    void removeX() {
        assertEquals("yry", RemoveCharacter.removeX("yrxy"));
    }
}