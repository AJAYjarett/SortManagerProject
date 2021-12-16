package app;

import input_output.InputReader;
import sorters.Sorter;

public class RuntimeController {

    public static void runSortManager(){
        boolean continueSorting = true;
        int[] arrayToSort;
        while (continueSorting){
            Sorter sorter = RuntimeTasks.getSorter();
            arrayToSort = RuntimeTasks.getAndShowRandomArray();
            RuntimeTasks.sortAndShowArray(sorter, arrayToSort);
            continueSorting = RuntimeTasks.endOrContinue();
        }
        InputReader.closeScanner();
    }
}
