package org.example;

public class SearchResults {
    private int linearSearchSorted;
    private int binarySearchSorted;
    private int linearSearchRandom;
    private int binarySearchRandom;

    public SearchResults(int linearSearchSorted, int binarySearchSorted, int linearSearchRandom, int binarySearchRandom) {
        this.linearSearchSorted = linearSearchSorted;
        this.binarySearchSorted = binarySearchSorted;
        this.linearSearchRandom = linearSearchRandom;
        this.binarySearchRandom = binarySearchRandom;
    }

    public void printResults() {
        System.out.println("Linear Search on Sorted List: " + linearSearchSorted);
        System.out.println("Binary Search on Sorted List: " + binarySearchSorted);
        System.out.println("Linear Search on Random List: " + linearSearchRandom);
        System.out.println("Binary Search on Random List: " + binarySearchRandom);
    }
}
