package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArePermutationsTests_2 {
    @Test
    void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "ab";
        String secondString = "b1a";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
}
