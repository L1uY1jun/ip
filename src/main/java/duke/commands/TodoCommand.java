package duke.commands;

import duke.exceptions.DukeException;
import duke.tasks.ToDo;
import duke.tools.Storage;
import duke.tools.TaskList;
import duke.tools.Ui;

/**
 * This class performs create a todo task with specified description command.
 */
public class TodoCommand implements Command {
    /** Todo task to be added into TaskList */
    private ToDo todo;

    /**
     * Constructor for class TodoCommand.
     *
     * @param description Description of task.
     */
    public TodoCommand(String description) {
        this.todo = new ToDo(description, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(TaskList taskList, Storage storage) throws DukeException {
        taskList.addTask(todo);
        storage.appendToFile(todo);
        return Ui.formatAddTaskString(todo);
    }
}
