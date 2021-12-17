package sorters;

import java.util.Arrays;

public class QuickSorter implements Sorter{

    @Override
    public int[] sort(int[] toSort) {
        Arrays.sort(toSort);
        return toSort;
    }
}
