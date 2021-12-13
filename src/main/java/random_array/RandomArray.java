package random_array;

import java.util.Random;

public class RandomArray {

    public int[] getRandomArray(int upperBound){
        Random random = new Random();
        int[] randomArray = new int[upperBound];
        for (int i = 0; i < upperBound; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}
