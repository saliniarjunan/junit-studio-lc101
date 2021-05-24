package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void validBracketsOutsideOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void onlyValidMultipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void validMultipleBracketsInBetweenStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launc[][][][][][][]hcode"));
    }

    @Test
    public void onlyOpenBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launchcode"));
    }

    @Test
    public void onlyClosedBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]Launchcode"));
    }

    @Test
    public void validBracketsInBetweenStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Laun[]chcode"));
    }

    @Test
    public void onlyOpenBracketsWithoutStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[["));
    }

    @Test
    public void onlyClosedBracketsWithoutStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]"));
    }

    @Test
    public void onlyOpenBracketsBetweenStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Laun[chcode"));
    }

    @Test
    public void onlyClosedBracketsBetweenStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code"));
    }

    @Test
    public void onlyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }
}
