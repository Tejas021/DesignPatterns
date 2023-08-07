package net.media.training.designpattern.builder;

public interface XmlBuilder {
    void addPerson(Person person);
    String getXml();
}
