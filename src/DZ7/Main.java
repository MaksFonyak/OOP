package DZ7;

public class Main {
    public static void main(String[] args) {
        CalculatorLogger logger = new SimpleCalculatorLogger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(1, 2);

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber division = calculator.divide(a, b);
    }
}
