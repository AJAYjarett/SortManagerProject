package app;

import input_output.InputReader;
import sorters.Sorter;

public class RuntimeController {

    //Deals with the overall running of the code, the highest level controller
    public static void runSortManager(){
        boolean continueSorting = true;
        int[] arrayToSort;
        while (continueSorting){

            //Stage 1. get the right sorter
            Sorter sorter = RuntimeTasks.getSorter();

            //Stage 2. get a random array and sort it
            arrayToSort = RuntimeTasks.getAndShowRandomArray();
            RuntimeTasks.sortAndShowArray(sorter, arrayToSort);

            //Stage 3. ask user if program should run again or close
            continueSorting = RuntimeTasks.endOrContinue();
        }
        InputReader.closeScanner();
    }
}
