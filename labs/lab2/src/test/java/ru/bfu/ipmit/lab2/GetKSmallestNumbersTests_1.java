package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests_1 {
    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
}
