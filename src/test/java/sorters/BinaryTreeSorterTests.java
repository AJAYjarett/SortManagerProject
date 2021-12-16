package sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

public class BinaryTreeSorterTests {

    int[] testArray;
    int[] testingArray;
    BinaryTreeSorter binaryTreeSorter = new BinaryTreeSorter();

    @BeforeEach
    void setup(){
        testArray = new int[] {1,2,3,4,5,6,7,8,9};
        testingArray = new int[] {9,8,7,6,5,4,3,2,1};

    }


    @Test
    @MethodSource("randomArrays")
    @DisplayName("Checking BubbleSorter works")
    void checkingBubbleSorterWorks() {
        Assertions.assertArrayEquals(binaryTreeSorter.sort(testingArray), testArray);
    }
}
