package net.media.training.designpattern.strategy;

public class AtmostValidationStrategy implements IntegerValidationStrategy{
    private int maxValue;

    public AtmostValidationStrategy(int maxValue) {
        this.maxValue = maxValue;
    }


    public void validate(int value) {
        if (value > maxValue) {
            throw new RuntimeException("Validation failed: Value exceeds maximum allowed.");
        }
    }

}
