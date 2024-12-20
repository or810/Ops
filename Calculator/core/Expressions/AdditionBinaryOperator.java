package Calculator.core.Expressions;

public class AdditionBinaryOperator extends BinaryOperator {
    public AdditionBinaryOperator() {
        super("+");
    }
    @Override
    public double evaluate(double a, double b) {
        return a + b;
    }

}
