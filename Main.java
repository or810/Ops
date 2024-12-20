import Calculator.core.Expressions.BinaryOperator;
import Calculator.core.Expressions.AdditionBinaryOperator;
import Calculator.core.Expressions.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        AdditionBinaryOperator operator = new AdditionBinaryOperator();
        System.out.println(operator.evaluate(3, 5));


        BinaryOperator binaryOperator = new BinaryOperator("-") {
            @Override
            public double evaluate(double a, double b) {
                return 0;
            }
        };

        UnaryOperator unaryOperator = new UnaryOperator("--") {
            @Override
            public double evaluate(double a) {
                return a--;
            }
        };
        // can be tested too
    }
}
