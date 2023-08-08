package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();

        List<Character> characters = new ArrayList();
        characters.add(person);
        characters.add(dog);
        characters.add(cat);
        characters.add(robot);

        Sun sun = new Sun(characters);


        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        person.goOutdoors();
        robot.goOutdoors();
        dog.goOutdoors();
        cat.goOutdoors();
    }

    public void everyoneOutdoorsComesIn() {
        for (Character character : sun.characters) {
            if (character.isOutdoors())
                character.goIndoors();
        }

    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {

        for (Character character : sun.characters) {
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }

        for (Character character : sun.characters) {
            if (!character.isOutdoors() && character.isFeelingWarm())
                return false;
        }

        return true;
    }

    public boolean allFeelCold() {
        return !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm() && !robot.isFeelingWarm();
    }
}