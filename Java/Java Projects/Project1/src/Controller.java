import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double x, y;

            while (sc.hasNext()) {
                // take input as a String and convert to an expression
                try {
                    x = sc.nextDouble();
                    String op = sc.next();
                    y = sc.nextDouble();


                    switch (op) {
                        case "+":
                            result = calculator.add(x, y);
                            break;
                        case "-":
                            result = calculator.subtract(x, y);
                            break;
                        case "*":
                            result = calculator.multiply(x, y);
                            break;
                        case "/":
                            result = calculator.divide(x, y);
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Mismatch Error");
                }
            }
            /*
            if(op.equals("+")) {
                result = calculator.add(x,y);
            } else if (op.equals("-")) {
                result = calculator.subtract(x,y);
            } else if (op.equals("*")) {
                result = calculator.multiply(x,y);
            } else if (op.equals("/")) {
                result = calculator.divide(x,y);
            }
             */
            if(result%2 == 0) {
                int resultInt = (int)result;
                System.out.println("Result: " + resultInt);
            } else {
                System.out.println("Result: " + result);
            }
        }

    /**
     * Method creates an expression out of the String, if possible
     * @param string
     */

    /* Use a stack to sort
    public void toExpression(String str) {
            }
        }

     */
    }

