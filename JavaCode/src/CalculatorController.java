import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable
{

    Double userInputNum = 0.0;
    Double userNextNum = 0.0;
    String userResponse = null;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * add - clears tge the text field and indicates add
     */
    public void add(){
        // userInput = input.getvalue();
        userResponse = "add";
    }

    public void subtract(){
        // userInput = input.getvalue();
        userResponse = "subtract";
    }

    public void multiply(){
        // userInput = input.getvalue();
        userResponse = "multiply";
    }

    public void divide(){
        // userInput = input.getvalue();
        userResponse = "divide";
    }

    public void clear(){}

    public void allClear(){}

    public double getResult() {

        double result = 0;
        try {
            switch (userResponse) {

                case "add":
                    result = userInputNum + userNextNum;
                    break;

                case "subtract":
                    result = userInputNum - userNextNum;
                    break;

                case "multiply":
                    result = userInputNum * userNextNum;
                    break;

                case "divide":
                    result = userInputNum / userNextNum;
                    break;

                default:
                    break;
            }
        } catch (NumberFormatException e) {
        }
        return result;
    }
}
