package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateMatrixTests_2 {
    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
}
