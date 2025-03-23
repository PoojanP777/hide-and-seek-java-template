package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    @Test
    void testLinearSearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int result = finder.linearSearch(sortedFuzzies);
        assertEquals(sortedFuzzies.indexOf(new Fuzzy("gold")), result);
    }

    @Test
    void testBinarySearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int result = finder.binarySearch(sortedFuzzies);
        assertEquals(sortedFuzzies.indexOf(new Fuzzy("gold")), result);
    }

    @Test
    void testLinearSearchOnRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int result = finder.linearSearch(randomFuzzies);
        assertEquals(randomFuzzies.indexOf(new Fuzzy("gold")), result);
    }

    @Test
    void testBinarySearchOnRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int result = finder.binarySearch(randomFuzzies);
        // Binary search won't work on unsorted list, expect -1
        assertEquals(-1, result);
    }
}
