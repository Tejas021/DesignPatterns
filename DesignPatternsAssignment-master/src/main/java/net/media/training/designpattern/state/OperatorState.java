package net.media.training.designpattern.state;

public class OperatorState implements CalculatorState {
    private final Calculator calculator;
    private final String firstOperand;
    private final Character operator;

    public OperatorState(Calculator calculator, String firstOperand, Character operator) {
        this.calculator = calculator;
        this.firstOperand = firstOperand;
        this.operator = operator;
    }

    public void input(Character c) {
        if (calculator.isDigit(c)) {
            calculator.changeState(new SecondOperandState(calculator, firstOperand, operator, c));
        } else if (calculator.isOperator(c)) {
            // Error handling for consecutive operators
            calculator.displayError();
        } else if (calculator.isEqualsOperator(c)) {
            // Ignoring equals operator after an operator
        }
    }
}