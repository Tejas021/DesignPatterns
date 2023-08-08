package net.media.training.designpattern.state;

public class SecondOperandState implements CalculatorState {
    private final Calculator calculator;
    private final String firstOperand;
    private final Character operator;
    private final StringBuilder display;

    public SecondOperandState(Calculator calculator, String firstOperand, Character operator, Character c) {
        this.calculator = calculator;
        this.firstOperand = firstOperand;
        this.operator = operator;
        this.display = new StringBuilder().append(c);
    }


    public void input(Character c) {
        if (calculator.isDigit(c)) {
            display.append(c);
            calculator.updateDisplay(display.toString());
        } else if (calculator.isOperator(c)) {
            calculator.calculate(firstOperand, operator, display.toString());
        } else if (calculator.isEqualsOperator(c)) {
            calculator.calculate(firstOperand, operator, display.toString());
        }
    }
}