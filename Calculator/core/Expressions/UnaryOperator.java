package Calculator.core.Expressions;

import Calculator.core.Expressions.Operator;

public abstract class UnaryOperator extends Operator {
    public UnaryOperator(String operation) {
        super(operation);
    }

    public abstract double evaluate(double a);
}
