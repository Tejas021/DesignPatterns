package net.media.training.designpattern.builder;

public class XMLPeopleBuilder implements XmlBuilder {

    private StringBuilder xmlBuilder;

    public XMLPeopleBuilder() {
        xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlBuilder.append("<People>");
    }


    public void addPerson(Person person) {
        xmlBuilder.append("<Person id=\"").append(person.getId()).append("\" name=\"").append(person.getName()).append("\">");
        xmlBuilder.append("<Address><City>").append(person.getCity()).append("</City><Country>").append(person.getCountry()).append("</Country></Address>");
        xmlBuilder.append("</Person>");
    }


    public String getXml() {
        xmlBuilder.append("</People>");
        return xmlBuilder.toString();
    }
}
