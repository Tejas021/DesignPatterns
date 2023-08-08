package net.media.training.designpattern.strategy;

public class NotEmptyValidationStrategy implements StringValidationStrategy {
    public void validate(String name) {
        if (name == null || name.length()==0) {
            throw new RuntimeException("Validation failed: Value should not be empty.");
        }
    }
}
