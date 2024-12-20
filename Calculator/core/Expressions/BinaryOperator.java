package Calculator.core.Expressions;

public abstract class BinaryOperator extends Operator {

    public BinaryOperator(String operator) {
        super(operator);
    }

    public abstract double evaluate(double a, double b);

}
