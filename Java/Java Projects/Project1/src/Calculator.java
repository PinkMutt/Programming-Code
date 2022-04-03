import java.util.Scanner;

/**
 * Calculator
 * able to do addition, subtraction, division, and multiplication.
 */
public class Calculator {
    double result;

    /**
     * Constructor for Calculator
     */
    public Calculator() {
    }

    double add(double x, double y) {
        return x + y;
    }

    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        return x / y;
    }

}
