import net.media.training.designpattern.command.Command;

import java.io.File;

public class MoveCommand implements Command {
    private final String source;
    private final String destination;

    public MoveCommand(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }


    public void execute() throws RuntimeException {
        File file = new File(source);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(destination)))
            throw new RuntimeException("Rename failed");
    }


    public void undo() {
        // Move the file back to the original location
    }
}