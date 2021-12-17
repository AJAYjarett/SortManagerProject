package sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import random_array.RandomArray;

import java.util.stream.Stream;

public class SorterTests {

    public static Stream<Arguments> getSorters(){
        return Stream.of(Arguments.arguments(new BubbleSorter()),
                Arguments.arguments(new QuickSorter()),
                Arguments.arguments(new BinaryTreeSorter()),
                Arguments.arguments(new MergeSorter()));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter functions with even array length")
    void checkingSorterFunctionsWithEvenArrayLength(Sorter sorter) {
        int [] testing = {6,5,4,3,2,1};
        int [] testAgainst = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(testAgainst, sorter.sort(testing));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter works with odd array length")
    void checkingSorterWorksWithOddArrayLength(Sorter sorter) {
        int[] testing = {5,4,3,2,1};
        int[] testAgainst = {1,2,3,4,5};
        Assertions.assertArrayEquals(testAgainst, sorter.sort(testing));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter works with array of 1 length")
    void checkingSorterWorksWithArrayOf1Length(Sorter sorter) {
        int[] testing = {1};
        int[] testAgainst = {1};
        Assertions.assertArrayEquals(testAgainst, sorter.sort(testing));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter works with Large array length")
    void checkingSorterWorksWithLargeArrayLength(Sorter sorter) {
        int[] testing = RandomArray.getRandomArray(10000);
        Assertions.assertEquals(10000, sorter.sort(testing).length);
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter works with duplicates in array")
    void checkingSorterWorksWithDuplicatesInArray(Sorter sorter) {
        int[] testing = {5,1,5,9,4,3,4,9};
        int[] testAgainst = {1,3,4,4,5,5,9,9};
        Assertions.assertArrayEquals(testAgainst, sorter.sort(testing));
    }
}
