package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class;

    @Before
    public void createBalancedBrackets() {
        test_Class = new BalancedBrackets();
    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyHasOneBracketPointingToRightReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test
    public void onlyHasOneBracketPointingToLeftReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void wordWithBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[Mike]"));
    }

    @Test
    public void wordWithOneBracketPointingToRightReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("Mik[e"));
    }

    @Test
    public void wordWithOneBracketPointToLeftReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("M]ike"));
    }

    @Test
    public void bracketsBeforeWordReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]Mike"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsBetweenTwoWordsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("Mike [Cheung]"));
    }

    @Test
    public void bracketsPointingOppositesReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("Mike ]Cheung["));
    }

    @Test
    public void bracketsOppositesWithNoWordReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsPointsToRightTwoTimesReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[["));
    }
}
