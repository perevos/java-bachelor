package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArePermutationsTests_1 {
    @Test
    void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "";
        String secondString = "";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
}
