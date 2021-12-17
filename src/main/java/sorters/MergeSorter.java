package sorters;

public class MergeSorter implements Sorter{

    @Override
    public int[] sort(int[] toSort) {
        mergeSort(toSort, 0, toSort.length-1);
        return toSort;
    }

    private void merge(int[] arr, int start, int pivot, int end){
        int length1 = pivot - start + 1;
        int length2 = end - pivot;

        int[] left = new int[length1];
        int[] right = new int[length2];

        for (int i = 0; i < length1; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < length2; i++) {
            right[i] = arr[pivot + 1 + i];
        }

        int leftIndex = 0, rightIndex = 0;
        int k = start;
        while (leftIndex < length1 && rightIndex < length2){
            if (left[leftIndex] <= right[rightIndex]){
                arr[k] = left[leftIndex];
                leftIndex++;
            } else {
                arr[k] = right[rightIndex];
                rightIndex++;
            }
            k++;
        }
        while (leftIndex < length1){
            arr[k] = left[leftIndex];
            leftIndex++;
            k++;
        }
        while (rightIndex < length2){
            arr[k] = right[rightIndex];
            rightIndex++;
            k++;
        }


    }

    private void mergeSort(int[] arrayToSort, int start, int end){
        if (start<end){
            int mid = (start+end)/2;

            mergeSort(arrayToSort, start, mid);
            mergeSort(arrayToSort, mid+1, end);

            merge(arrayToSort, start, mid, end);
        }
    }


}
