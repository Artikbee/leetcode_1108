package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void defangIPaddrTest(){
       String result = "1.1.1.1";
       String expected = "1[.]1[.]1[.]1";

        Assertions.assertEquals(expected,solution.defangIPaddr(result));
    }

}