package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        SearchResults results = new SearchResults(
            finder.linearSearch(sortedFuzzies),
            finder.binarySearch(sortedFuzzies),
            finder.linearSearch(randomFuzzies),
            finder.binarySearch(randomFuzzies)
        );

        results.printResults();
    }
}
