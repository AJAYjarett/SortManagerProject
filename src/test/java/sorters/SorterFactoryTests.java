package sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SorterFactoryTests {


    public static Stream<Arguments> getSorters(){
        return Stream.of(Arguments.arguments("1", new BubbleSorter()),
                Arguments.arguments("2", new MergeSorter()),
                Arguments.arguments("3", new BinaryTreeSorter()));
    }

    @ParameterizedTest
    @MethodSource("getSorters")
    @DisplayName("Checking Sorter Creation")
    void checkingSorterCreation(String type, Sorter sorter) {
        Assertions.assertEquals(SorterFactory.getSorter(type).getClass(), sorter.getClass());
    }
}
