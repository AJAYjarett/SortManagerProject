package app;

import input_output.InputReader;
import input_output.OutputMaker;
import random_array.RandomArray;
import sorters.Sorter;
import sorters.SorterFactory;
import sorters.SorterRunner;

public class RuntimeController {

    public static void runSortManager(){
        boolean continueSorting = true;
        int[] arrayToSort;
        int[] arraySorted;
        controllerFeatures
        while (continueSorting){
            OutputMaker.displayMenu();
            Sorter sorter = SorterFactory.getSorter(InputReader.getInput());
            OutputMaker.displayUpperBoundIn();
            arrayToSort = RandomArray.getRandomArray(Integer.parseInt(InputReader.getInput()));
            OutputMaker.displayRandomArray(arrayToSort);
            SorterRunner sorterRunner = new SorterRunner(sorter,arrayToSort);
            arraySorted = sorterRunner.getSortedArr();
            OutputMaker.displaySortedArray(arraySorted);
            OutputMaker.displayTimeTaken(sorterRunner.getTimeTaken());
            OutputMaker.displayEnding();
            if (InputReader.getInput().equals("1")) continueSorting = false;
        }
        InputReader.closeScanner();
    }
}
