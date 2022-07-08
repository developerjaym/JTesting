package com.jaymansmann;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FirstTest {
    
    @Test
    public void isOdd_withOddInput() {
        // arrange
        int input = 1;
        // act
        boolean actual = First.isOdd(input);
        // assert
        assertTrue(actual, "1 is odd");
    }

    // What other scenarios should I test for isOdd() method?

    // What scenarios should I test for toUpperCase() method?

    // What scenarios should I test for print() method?
}
