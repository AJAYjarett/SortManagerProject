package app;

import input_output.InputReader;
import input_output.OutputMaker;
import sorters.Sorter;
import sorters.SorterFactory;

public class RuntimeController {

    public static void runSortManager(){
        OutputMaker.displayMenu();
        Sorter sorter = SorterFactory.getSorter(InputReader.getInput());

    }
}
