package net.media.training.designpattern.command;

public interface Command {
    void execute() throws Exception;

    void undo() throws Exception;
}