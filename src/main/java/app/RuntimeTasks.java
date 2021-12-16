package app;

import input_output.InputReader;
import input_output.OutputMaker;
import random_array.RandomArray;
import sorters.Sorter;
import sorters.SorterFactory;
import sorters.SorterRunner;

public class RuntimeTasks {

    public static Sorter getSorter(){
        OutputMaker.displayMenu();
        Sorter sorter = SorterFactory.getSorter(InputReader.getInput());
        return sorter;
    }

    public static int[] getAndShowRandomArray(){
        int[] arrayToSort;
        OutputMaker.displayUpperBoundIn();
        arrayToSort = RandomArray.getRandomArray(Integer.parseInt(InputReader.getInput()));
        OutputMaker.displayRandomArray(arrayToSort);
        return arrayToSort;
    }

    public static void sortAndShowArray(Sorter sorter, int[] arrayToSort){
        int[] arraySorted;
        SorterRunner sorterRunner = new SorterRunner(sorter,arrayToSort);
        arraySorted = sorterRunner.getSortedArr();
        OutputMaker.displaySortedArray(arraySorted);
        OutputMaker.displayTimeTaken(sorterRunner.getTimeTaken());
    }

    public static boolean endOrContinue(){
        OutputMaker.displayEnding();
        if (InputReader.getInput().equals("1")) return false;
        return true;
    }
}
