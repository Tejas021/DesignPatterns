package net.media.training.designpattern.decorator;

public interface CriteriaDecorator extends Criteria{
    boolean evaluate(Application theApp);
}
