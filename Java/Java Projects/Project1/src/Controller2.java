
import java.util.Scanner;

public class Controller2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double result = 0;
        while(sc.hasNext()) {
            double x = sc.nextDouble();
            String op = sc.next();
            double y = sc.nextDouble();

            switch (op) {
                case "+":
                    result = calculator.add(x,y);
                    break;
                case "-":
                    result = calculator.subtract(x,y);
                    break;
                case "*":
                    result = calculator.multiply(x,y);
                    break;
                case "/":
                    result = calculator.divide(x,y);
                    break;
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
    }
}

