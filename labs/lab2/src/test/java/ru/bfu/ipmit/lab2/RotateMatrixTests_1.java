package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateMatrixTests_1 {
    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {{1, 2,}, {3, 4}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{3, 1}, {4, 2}};
        assertArrayEquals(actualResult, expectedResult);
    }
}
