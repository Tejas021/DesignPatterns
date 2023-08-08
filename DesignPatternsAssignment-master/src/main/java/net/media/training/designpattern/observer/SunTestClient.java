package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 9:06:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class SunTestClient {
    private final Person person;
    private final Cat cat;
    private final Dog dog;
    private final Robot robot;

    private boolean personWentOut = false;
    private boolean robotWentOut = false;
    private boolean catWentOut;
    private boolean dogWentOut;
    private Sun sun;

    public SunTestClient() {
        this.person = new Person();
        this.cat = new Cat();
        this.dog = new Dog();
        this.robot = new Robot();
    }

    public void aFewCharactersGoOutdoors() {
        person.goOutdoors();
        robot.goOutdoors();
        personWentOut = true;
        robotWentOut = true;
    }

    public void aFewOtherCharactersGoOutdoors() {
        cat.goOutdoors();
        dog.goOutdoors();
        catWentOut = true;
        dogWentOut = true;
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {
        for(Character character : sun.characters){
            if (character.isOutdoors() && !character.isFeelingTired())
                return false;
        }

        return true;
    }

    public boolean outdoorsCharactersFeelWarm() {

        for(Character character : sun.characters){
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }


        for(Character character : sun.characters){
            if (!character.isOutdoors() && character.isFeelingWarm())
                return false;
        }

        return true;
    }
}