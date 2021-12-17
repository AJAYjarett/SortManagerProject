package app;

import input_output.InputChecker;
import input_output.InputReader;
import input_output.OutputMaker;
import logger.LogWriter;
import random_array.RandomArray;
import sorters.Sorter;
import sorters.SorterFactory;
import sorters.SorterRunner;

import java.util.logging.Level;

public class RuntimeTasks {

    public static Sorter getSorter(){
        LogWriter.writeLog(Level.INFO, "Displaying menu");
        OutputMaker.displayMenu();
        LogWriter.writeLog(Level.FINE, "Obtaining user choice for sorter");
        Sorter sorter = SorterFactory.getSorter(InputChecker.checkInputMenu());
        return sorter;
    }

    public static int[] getAndShowRandomArray(){
        int[] arrayToSort;
        OutputMaker.displayUpperBoundIn();
        arrayToSort = RandomArray.getRandomArray(InputChecker.checkInputUpperbound());
        LogWriter.writeLog(Level.INFO, "Creating random Array");
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
        if (InputChecker.checkInputContinue() == 1) return false;
        LogWriter.writeLog(Level.INFO, "Repeating Program");
        return true;
    }
}
