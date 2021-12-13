package sorters;

public class SorterRunning {

    public static int[] runSorter(Sorter sorter, int[] arrToSort){
        int[] sortedArr = sorter.sort(arrToSort);
        return sortedArr;
    }
}
