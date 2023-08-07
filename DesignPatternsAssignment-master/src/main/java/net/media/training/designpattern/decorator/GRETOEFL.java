package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 11:51:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class GRETOEFL {



    public boolean evaluate(Application theApp) {
        return  new TOFLDecorator(new GREDecorator(new GPAEval())).evaluate(theApp);

    }
}
