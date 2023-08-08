package net.media.training.designpattern.strategy;

public interface StringValidationStrategy extends ValidationStrategy {
    void validate(String string);
}
