package net.media.training.designpattern.state;

public class DigitState implements CalculatorState {
    private final Calculator calculator;
    private final StringBuilder display;

    public DigitState(Calculator calculator, Character c) {
        this.calculator = calculator;
        this.display = new StringBuilder().append(c);
    }


    public void input(Character c) {
        if (calculator.isDigit(c)) {
            display.append(c);
            calculator.updateDisplay(display.toString());
        } else if (calculator.isOperator(c)) {
            calculator.changeState(new OperatorState(calculator, display.toString(), c));
        } else if (calculator.isEqualsOperator(c)) {
            calculator.calculate(display.toString());
        }
    }
}