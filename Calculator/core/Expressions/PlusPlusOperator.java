package Calculator.core.Expressions;

public class PlusPlusOperator extends UnaryOperator {
    public PlusPlusOperator(String operation) {
        super(operation);
    }

    @Override
    public double evaluate(double a) {
        return a++;
    }
}
