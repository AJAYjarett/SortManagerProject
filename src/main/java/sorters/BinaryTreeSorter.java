package sorters;

import sorters.binary_tree.BinaryTree;

import java.util.Arrays;

public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] sort(int[] toSort) {
        BinaryTree binaryTree = new BinaryTree(toSort[0]);
        int[] restOfArray = Arrays.copyOfRange(toSort, 1,toSort.length-1);
        binaryTree.addElements(restOfArray);
        return binaryTree.getSortedTreeAsc();
    }
}
