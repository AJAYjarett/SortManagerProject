package input_output;

import java.util.Arrays;

public class OutputMaker {

    public static void displayMenu(){
        System.out.println("Please choose a sorting method:");
        System.out.println("1. BubbleSort");
    }

    public static void displayArray(int[] arrToDisplay){
        System.out.println(Arrays.toString(arrToDisplay));
    }

    public static void displayUpperBoundIn(){
        System.out.println("Please input the length of your random array:");
    }
}
