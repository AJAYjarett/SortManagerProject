package sorters;

import logger.LogWriter;

import java.util.Objects;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class SorterFactory {

    public static Sorter getSorter(int sorterType){
        LogWriter.writeLog(Level.INFO, "Creating Sorter");
        if (Objects.isNull(sorterType)) return null;
        if (sorterType == 1) return new BubbleSorter();
        if (sorterType == 2) return new QuickSorter();
        if (sorterType == 3) return new BinaryTreeSorter();
        if (sorterType == 4) return new MergeSorter();

        return null;
    }

}
