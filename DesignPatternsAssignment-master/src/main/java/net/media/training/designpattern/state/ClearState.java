package net.media.training.designpattern.state;


public class ClearState implements CalculatorState {
    private final Calculator calculator;

    public ClearState(Calculator calculator) {
        this.calculator = calculator;
    }


    public void input(Character c) {
        if (calculator.isDigit(c)) {
            calculator.changeState(new DigitState(calculator, c));
        } else if (calculator.isOperator(c)) {
            // Error handling for invalid input
            calculator.displayError();
        } else if (calculator.isEqualsOperator(c)) {
            // Ignoring equals operator in Clear state
        }
    }
}
