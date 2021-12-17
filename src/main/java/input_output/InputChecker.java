package input_output;

public class InputChecker {


    //Checks the input is within the acceptable options and asks for new input if not
    public static int checkInput(int inputToCheck, int stage){
        boolean correctInput = false;
        int input = inputToCheck;
        while (correctInput == false){
            if (input == -1){
                OutputMaker.displayWrongInput();
                if (stage == 1) input = InputReader.getMenuInput();
                if (stage == 2) input = InputReader.getUpperboundInput();
                if (stage == 3) input = InputReader.getContinueInput();
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
        return  checkInput(InputReader.getContinueInput(), 3);
    }
}
