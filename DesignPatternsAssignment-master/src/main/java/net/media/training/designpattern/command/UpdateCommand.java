package net.media.training.designpattern.command;

import net.media.training.designpattern.command.Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateCommand implements Command {
    private final String fileName;
    private final String content;

    public UpdateCommand(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }


    public void execute() throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void undo() {
        // Revert to the original content (if available)
    }
}
