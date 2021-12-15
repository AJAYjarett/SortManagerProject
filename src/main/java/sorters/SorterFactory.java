package sorters;

import sorters.binary_tree.BinaryTreeSorter;

public class SorterFactory {

    public static Sorter getSorter(String sorterType){
        if (sorterType == null) return null;
        if (sorterType.equals("1")) return new BubbleSorter();
        if (sorterType.equals("2")) return new MergeSorter();
        if (sorterType.equals("3")) return new BinaryTreeSorter();

        return null;
    }

}
