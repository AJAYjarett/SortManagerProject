package sorters;

import logger.LogWriter;

import java.util.logging.Level;

public class SorterRunner {

    private long timeTaken;
    private int[] sortedArr;

    public SorterRunner(Sorter sorter, int[] arrToSort) {
        LogWriter.writeLog(Level.INFO, "Starting sorting timer");
        long startTime = System.nanoTime();
        LogWriter.writeLog(Level.INFO, "Running Sorter");
        sortedArr = sorter.sort(arrToSort);
        long endTime = System.nanoTime();
        LogWriter.writeLog(Level.INFO, "Ending sorting timer");
        timeTaken = endTime-startTime;
    }

    public int[] getSortedArr() {
        return sortedArr;
    }


    public long getTimeTaken() {
        return timeTaken;
    }

}
