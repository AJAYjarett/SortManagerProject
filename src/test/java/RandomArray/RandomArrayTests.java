package RandomArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import random_array.RandomArray;

import java.util.Objects;

public class RandomArrayTests {

    @ParameterizedTest
    @ValueSource(ints = {2, 0, 10, 15, 13, 20})
    @DisplayName("Checking the array is the right length")
    void checkingTheArrayIsTheRightLength(int arrayLength) {
        int[] testArr = RandomArray.getRandomArray(arrayLength);
        Assertions.assertEquals(testArr.length, arrayLength);
    }

    @Test
    @DisplayName("Check Array is full")
    void checkArrayIsFull() {
        int[] testArr = RandomArray.getRandomArray(10);
        for (int i = 0; i < testArr.length; i++) {
            Assertions.assertTrue(Objects.nonNull(testArr[i]));
        }

    }
}
