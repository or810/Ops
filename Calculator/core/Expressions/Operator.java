package Calculator.core.Expressions;

import Calculator.core.Expression;

public abstract class Operator implements Expression {
    protected String operation;

    public Operator(String operation) {
        this.operation = operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double evaluate(double a) {return -1;}
    public double evaluate(double a, double b) {return -1;}
}
