package DZ7;

public class SimpleCalculatorLogger implements CalculatorLogger{
    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
