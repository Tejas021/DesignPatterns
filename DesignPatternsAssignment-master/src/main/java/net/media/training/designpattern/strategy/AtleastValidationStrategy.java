package net.media.training.designpattern.strategy;

public class AtleastValidationStrategy implements IntegerValidationStrategy {
    private int minValue;

    public AtleastValidationStrategy(int minValue) {
        this.minValue = minValue;
    }


    public void validate(int salary) {

        if (salary < minValue) {
            throw new RuntimeException("Validation failed: Value is less than minimum allowed.");
        }
    }
}
