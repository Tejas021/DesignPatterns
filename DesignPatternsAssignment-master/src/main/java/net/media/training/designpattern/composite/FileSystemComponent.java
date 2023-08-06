package net.media.training.designpattern.composite;

public interface FileSystemComponent {

    Directory getParent();
    String getName();
    int getSize();

    void setParent(Directory directory);
}
