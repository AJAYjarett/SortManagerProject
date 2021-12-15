package input_output;

import java.util.Arrays;

public class OutputMaker {

    public static void displayMenu(){
        System.out.println("Please choose a sorting method:");
        System.out.println("1. BubbleSort");
    }

    public static void displayRandomArray(int[] arrToDisplay){
        System.out.println("This is your random Array:");
        System.out.println(Arrays.toString(arrToDisplay));
    }

    public static void displaySortedArray(int[] arrToDisplay){
        System.out.println("This is your sorted Array:");
        System.out.println(Arrays.toString(arrToDisplay));
    }

    public static void displayTimeTaken(long timeTakenNano){
        System.out.println("Time taken to sort:");
        System.out.println(timeTakenNano + " Nanoseconds");
    }

    public static void displayUpperBoundIn(){
        System.out.println("Please input the length of your random array:");
    }
}
