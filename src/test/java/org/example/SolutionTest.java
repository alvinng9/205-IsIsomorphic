package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isIsomorphicTest() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphic("egg", "add"));
        assertTrue(solution.isIsomorphic("paper", "title"));
        assertFalse(solution.isIsomorphic("foo","bar"));
        assertFalse(solution.isIsomorphic("baba","badc"));
    }

}