package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    // Linear Search Implementation
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).getColor().equals("gold")) {
                return i; // Return index of the golden fuzzy
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary Search Implementation (only works on sorted lists)
    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int left = 0, right = fuzzies.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = fuzzies.get(mid).getColor().compareTo("gold");

            if (comparison == 0) {
                return mid; // Found the golden fuzzy
            } else if (comparison < 0) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Return -1 if not found
    }
}
