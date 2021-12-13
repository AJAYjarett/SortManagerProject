package app;

import input_output.InputReader;
import input_output.OutputMaker;
import random_array.RandomArray;
import sorters.Sorter;
import sorters.SorterFactory;

public class RuntimeController {

    public static void runSortManager(){
        int[] arrayToSort;
        int[] arraySorted;
        OutputMaker.displayMenu();
        Sorter sorter = SorterFactory.getSorter(InputReader.getInput());
        OutputMaker.displayUpperBoundIn();
        arrayToSort = RandomArray.getRandomArray(Integer.parseInt(InputReader.getInput()));
        OutputMaker.displayRandomArray(arrayToSort);
        arraySorted = sorter.sort(arrayToSort);
        OutputMaker.displaySortedArray(arraySorted);
    }
}
