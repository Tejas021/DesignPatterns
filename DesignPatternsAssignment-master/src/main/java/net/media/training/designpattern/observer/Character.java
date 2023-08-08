package net.media.training.designpattern.observer;

interface Character {

    boolean isOutdoors();

    void notifySunSet();

    void notifySunRose();

    void goIndoors();

    boolean isFeelingWarm();

    boolean isFeelingTired();

    void goOutdoors();


}