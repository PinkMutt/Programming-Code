import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Contains the functionality of the Calculator.
 */
public class CalculatorController implements Initializable {

    @FXML
    Button oneButton;
    @FXML
    Button twoButton;
    @FXML
    Button threeButton;
    @FXML
    Button fourButton;
    @FXML
    Button fiveButton;
    @FXML
    Button sixButton;
    @FXML
    Button sevenButton;
    @FXML
    Button eightButton;
    @FXML
    Button nineButton;
    @FXML
    Button percentButton;
    @FXML
    Button zeroButton;
    @FXML
    Button equalButton;
    @FXML
    Button additionButton;
    @FXML
    Button multiplicationButton;
    @FXML
    Button decimalButton;
    @FXML
    Button clearButton;
    @FXML
    Button negativeButton;
    @FXML
    Button subtractionButton;
    @FXML
    Button divisionButton;
    @FXML
    TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private int operatorCounter = 0;
    private double firstEntry = 0.0;
    private double secondEntry = 0.0;
    private double result = 0.0;

    private String numberDisplayed = null;
    private ArrayList<String> operators = new ArrayList<>();

    /**
     * Add method
     * adds the first entry to the second entry
     *
     */

    public void add(){
        setFirstEntry();
        textField.setText("");
        operators.add("+");
        operatorCounter++;
    }

    public void subtract(){
        setFirstEntry();
        operators.add("-");
        operatorCounter++;
    }

    public void divide(){
        setFirstEntry();
        textField.setText("");
        operators.add("/");
        operatorCounter++;
    }

    public void multiply(){
        setFirstEntry();
        textField.setText("");
        operators.add("*");
        operatorCounter++;
    }

    public void setFirstEntry(){
        firstEntry = Double.parseDouble(textField.getText());
    }

    public void setSecondEntry(){
        secondEntry = Double.parseDouble(textField.getText());
    }

    public void negative(){}

    public double getPercent(){
        return 0.0;
    }

    public void displayResult(){
        setSecondEntry();
        String operatorType = operators.get(operatorCounter - 1);
        switch(operatorType){
            case "+" :
                result = firstEntry + secondEntry;
                break;

            case "-":
                result = firstEntry - secondEntry;
                break;

            case "/":
                result = firstEntry / secondEntry;
                break;

            case "*":
                result = firstEntry * secondEntry;
                break;

            default:
                break;
        }
        textField.setText(Double.toString(result));
    }

    /**
     * Displays one
     */
    public void displayOne(){
        clearButton.setText("C");
        textField.setText(textField.getText() + 1);
    }

    /**
     * Displays two
     */
    public void displayTwo() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 2);
    }

    /**
     * Displays three
     */
    public void displayThree() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 3);
    }

    /**
     * Displays four
     */
    public void displayFour() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 4);
    }

    /**
     * Display five
     */
    public void displayFive() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 5);
    }

    /**
     * Display six
     */
    public void displaySix() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 6);
    }

    /**
     * Display seven
     */
    public void displaySeven() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 7);
    }

    /**
     * Display eight
     */
    public void displayEight() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 8);
    }

    /**
     * Display Nine
     */
    public void displayNine() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 9);
    }

    /**
     * Display Zero
     */
    public void displayZero() {
        clearButton.setText("C");
        textField.setText(textField.getText() + 0);
    }

    /**
     * Clears the Calculator
     */
    public void displayClear() {
        textField.setText("");
        clearButton.setText("CE");
    }
    public void displayClearEverything() {
        firstEntry = 0;
        secondEntry = 0;
        result = 0;
        operatorCounter = 0;
        operators = null;
    }
}
