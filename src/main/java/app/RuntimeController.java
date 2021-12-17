package app;

import input_output.InputReader;
import logger.LogWriter;
import sorters.Sorter;

import java.util.logging.Level;

public class RuntimeController {

    //Deals with the overall running of the code, the highest level controller
    public static void runSortManager(){
        LogWriter.createLogger();
        LogWriter.writeLog(Level.INFO, "Program begins");
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
        LogWriter.writeLog(Level.INFO, "Ending Program");
    }
}
