package sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import random_array.RandomArray;

import java.util.stream.Stream;

public class SorterPerformanceTests {

    public static Stream<Arguments> getSorters(){
        return Stream.of(Arguments.arguments(new BubbleSorter()),
                Arguments.arguments(new QuickSorter()),
                Arguments.arguments(new BinaryTreeSorter()),
                Arguments.arguments(new MergeSorter()));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Testing performance of sorting algorithms")
    void testingPerformanceOfSortingAlgorithms(Sorter sorter) {
        int [] testing = RandomArray.getRandomArray(1000);
        long startTime = System.nanoTime();
        int[] test =  sorter.sort(testing);
        long endTime = System.nanoTime();
        long timeTaken = endTime-startTime;
        System.out.println("Time taken for " + sorter.getClass().toString());
        System.out.println(timeTaken);
        Assertions.assertTrue(timeTaken > 0 && timeTaken < 20000000);
    }
}
