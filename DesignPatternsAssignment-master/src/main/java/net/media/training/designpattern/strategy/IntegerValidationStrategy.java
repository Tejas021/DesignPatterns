package net.media.training.designpattern.strategy;

public interface IntegerValidationStrategy extends ValidationStrategy{
    void validate(int number);
}
