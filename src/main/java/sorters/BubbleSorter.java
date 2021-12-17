package sorters;

public class BubbleSorter implements Sorter{
    @Override
    public int[] sort(int[] toSort) {
        boolean sorted = false;
        int iterationCounter = 0;
        //Temp int to facilitate swapping ints in the array around
        int tempInt;
        while (!sorted){
            iterationCounter++;
            //Count changes to identify when the array has been sorted.
            int countChanges = 0;
            for (int i = 0; i < toSort.length-1; i++) {
                if(toSort[i]>toSort[i+1]){
                    tempInt = toSort[i];
                    toSort[i] = toSort[i+1];
                    toSort[i+1] = tempInt;
                    countChanges++;
                }

            }
            if(countChanges==0) sorted = true;
        }
        System.out.println(iterationCounter);
        return toSort;
    }
}

