package sorters;

import java.util.Arrays;

public class MergeSorter implements Sorter{

    @Override
    public int[] sort(int[] toSort) {
        Arrays.sort(toSort);
        return toSort;
    }
}
