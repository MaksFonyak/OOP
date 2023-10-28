package DZ7;

public class ComplexCalculator {
    private CalculatorLogger logger;

    public ComplexCalculator(CalculatorLogger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        logger.log(a + " + " + b + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        logger.log(a + " * " + b + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        logger.log(a + " / " + b + " = " + result);
        return result;
    }
}
