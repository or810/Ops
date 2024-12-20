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


//        NumberW number = new NumberW(3.34343);
//
//        double n2 = number.doubleValue();
//
//        long n3 = number.longValue();
//
//
//        int n4 = number.intValue();
//        System.out.println(n2 + "\n" + n3 + "\n" + n4);
//
//
//        OperatorsRegistry operatorsRegistry = new OperatorsRegistry();
//        operatorsRegistry.addInfixOperator("+", (double a, double b) -> a + b);
//
//        System.out.println(operatorsRegistry.test(3,244));
//        /*
//
//        Operators ops.AddInfixOperator("+", (a,b) -> a + b);
//         */
//
    }
}
