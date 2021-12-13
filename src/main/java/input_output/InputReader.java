package input_output;

import java.util.Scanner;

public class InputReader {
    static Scanner scanner = new Scanner(System.in);

    public static String getInput(){
        return scanner.nextLine();
    }

    public static void closeScanner(){
        scanner.close();
    }
}
