package sorters;

public class SorterRunner {

    private long timeTaken;
    private int[] sortedArr;

    public SorterRunner(Sorter sorter, int[] arrToSort) {
        long startTime = System.nanoTime();
        sortedArr = sorter.sort(arrToSort);
        long endTime = System.nanoTime();
        timeTaken = endTime-startTime;
    }

    public int[] getSortedArr() {
        return sortedArr;
    }


    public long getTimeTaken() {
        return timeTaken;
    }

}
