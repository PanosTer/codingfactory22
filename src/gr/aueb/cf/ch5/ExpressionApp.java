package gr.aueb.cf.ch5;

public class ExpressionApp {

    public static void main(String[] args) {
        double num1 = 125655885.5;
        double num2= 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2;
        mod = num1 % num2;

        System.out.printf(" result = %,015.2f\n mod = %,.2f", result, mod);
    }
}
