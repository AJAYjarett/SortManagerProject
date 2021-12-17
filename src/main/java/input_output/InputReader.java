package input_output;

import java.util.Scanner;

public class InputReader {
    static Scanner scanner = new Scanner(System.in);

    public static int getMenuInput(){
        String userInput = scanner.nextLine();
        try{
            int inputToCheck = Integer.parseInt(userInput);
            if (inputToCheck <= 0 || inputToCheck > 3){
                return -1;
            }
            return inputToCheck;
        } catch (NumberFormatException e){
            return -1;
        }
    }

    public static int getUpperboundInput(){
        String userInput = scanner.nextLine();
        try{
            int inputToCheck = Integer.parseInt(userInput);
            if (inputToCheck <= 0){
                return -1;
            }
            return inputToCheck;
        } catch (NumberFormatException e){
            return -1;
        }
    }

    public static int getContinueInput(){
        String userInput = scanner.nextLine();
        try{
            int inputToCheck = Integer.parseInt(userInput);
            if (inputToCheck == 1 || inputToCheck == 2){
                return inputToCheck;
            }
            return -1;
        } catch (NumberFormatException e){
            return -1;
        }
    }

    public static void closeScanner(){
        scanner.close();
    }
}
