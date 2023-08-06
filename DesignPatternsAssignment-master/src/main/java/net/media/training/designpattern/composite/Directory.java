package net.media.training.designpattern.composite;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystemComponent{
    private final String name;
//    private final List<File> files;
//    private final List<Directory> directories;

    private final List <FileSystemComponent> components = new ArrayList<FileSystemComponent>();
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystemComponent> files) {
        this.name = name;
//        this.files = files;
//        this.directories = directories;

        for(FileSystemComponent file: files){
            file.setParent(this);
        }
//        for (Directory directory : directories) {
//            directory.setParent(this);
//        }
//
//        for (File file : files) {
//            file.setParent(this);
//        }
    }

    public int getSize() {
        int sum = 0;

        for(FileSystemComponent file : components){
            sum+=file.getSize();
        }

//        for (File file : directoryToSize.getFiles()) {
//            sum += file.getSize();
//        }
//
//        for (Directory directory : directoryToSize.getDirectories()) {
//            sum += getSize(directory);
//        }

        return sum;
    }

//    public int getSize() {
//        return getSize(this);
//    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

//    public void delete(Directory directoryToDelete) {
//        while (directoryToDelete.getFiles().size() > 0) {
//            File file = directoryToDelete.getFiles().get(0);
//            file.getParent().removeEntry(file);
//        }
//
//        while (directoryToDelete.getDirectories().size() > 0) {
//            Directory directory = directoryToDelete.getDirectories().get(0);
//            delete(directory);
//        }
//
//        directoryToDelete.getParent().removeEntry(directoryToDelete);
//    }

//    public void delete() {
//        delete(this);
//    }

//    public void removeEntry(File file) {
//        files.remove(file);
//    }

    public void removeEntry(FileSystemComponent component) {
        components.remove(component);
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }


//    public boolean componentExists(FileSystemComponent component){
//        for( FileSystemComponent comp : components){
//            if (comp.)
//        }
//    }
    public boolean containsComponent(FileSystemComponent component) {
        return components.contains(component);
    }

//    private boolean fileExists(String name, Directory directoryToSearch) {
//        for (File file : directoryToSearch.getFiles()) {
//            if (file.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Directory directory : directoryToSearch.getDirectories()) {
//            if (fileExists(name, directory))
//                return true;
//        }
//
//        return false;
//    }
//
//    public boolean fileExists(String name) {
//        return fileExists(name, this);
//    }
//
//    public boolean directoryExists(String name) {
//        return directoryExists(name, this);
//    }
//
//    private boolean directoryExists(String name, Directory directoryToSearch) {
//        if (directoryToSearch.getName().equals(name))
//            return true;
//
//        for (Directory directory : directoryToSearch.getDirectories()) {
//            if (directory.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Directory directory : directories) {
//            if (directory.fileExists(name)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    public List<FileSystemComponent> getComponents() {
        return components;
    }

//    public List<Directory> getDirectories() {
//        return directories;
//    }

    public Directory getParent() {
        return parent;
    }
}
