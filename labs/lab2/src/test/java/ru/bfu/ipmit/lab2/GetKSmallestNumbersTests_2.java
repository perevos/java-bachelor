package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests_2 {
    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {1};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {1};
        assertArrayEquals(actualResult, expectedResult);
    }
}
