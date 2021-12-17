package input_output;

public class InputChecker {


    public static int checkInput(int inputToCheck, int stage){
        boolean correctInput = false;
        int input = inputToCheck;
        while (correctInput == false){
            if (input == -1){
                OutputMaker.displayWrongInput();
                if (stage == 1) input = InputReader.getMenuInput();
                if (stage == 2) input = InputReader.getUpperboundInput();
                continue;
            }
            if (input != -1) correctInput = true;
        }
        return  input;
    }

    public static int checkInputMenu(){
        return  checkInput(InputReader.getMenuInput(), 1);
    }


    public static int checkInputUpperbound(){
        return  checkInput(InputReader.getUpperboundInput(), 2);
    }

    public static int checkInputContinue(){
        return  checkInput(InputReader.getUpperboundInput(), 3);
    }
}
