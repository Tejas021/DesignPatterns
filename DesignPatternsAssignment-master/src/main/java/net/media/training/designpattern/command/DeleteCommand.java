import net.media.training.designpattern.command.Command;

import java.io.File;

public class DeleteCommand implements Command {
    private final String fileName;

    public DeleteCommand(String fileName) {
        this.fileName = fileName;
    }


    public void execute() {
        File file = new File(fileName);
        file.delete();
    }


    public void undo() {
        // Restore the deleted file (if possible)
    }
}
