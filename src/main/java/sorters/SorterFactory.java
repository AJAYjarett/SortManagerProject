package sorters;

import java.util.Objects;

public class SorterFactory {

    public static Sorter getSorter(int sorterType){
        if (Objects.isNull(sorterType)) return null;
        if (sorterType == 1) return new BubbleSorter();
        if (sorterType == 2) return new MergeSorter();
        if (sorterType == 3) return new BinaryTreeSorter();

        return null;
    }

}
