package net.media.training.designpattern.strategy;

public class LengthValidationStrategy implements StringValidationStrategy {
    private int allowedLength;
    public LengthValidationStrategy(int allowedLength) {
        this.allowedLength = allowedLength;
    }


    public void validate(String strValue) {

        if (strValue.length() > allowedLength) {
            throw new RuntimeException("Validation failed: Value length exceeds allowed length.");
        }
    }
}
