package input_output;

import java.util.Arrays;

public class OutputMaker {

    public void displayMenu(){
        System.out.println("Please choose a sorting method:");
        System.out.println("1. BubbleSort");
    }

    public void displayArray(int[] arrToDisplay){
        System.out.println(Arrays.toString(arrToDisplay));
    }
}
