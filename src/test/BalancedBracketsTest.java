package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void StringInBrackets(){

            assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void BracketsInTheString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Lau[nchC]ode"));

    }

    @Test
    public void nullString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void unBalancedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }
    @Test
    public void invertedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void noBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void doubleBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }
    @Test
    public void doublerightsidedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]]"));
    }
    @Test
    public void excessiveBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
    }
    @Test
    public void twoBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][code]"));
    }

}
