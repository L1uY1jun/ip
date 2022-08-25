package duke.tools;

import duke.exceptions.DukeException;
import duke.tasks.Task;

import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList(List<Task> storedTask) {
        this.taskList = storedTask;
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

    public int getSize() {
        return this.taskList.size();
    }

    public Task getTask(int index) throws DukeException {
        try {
            return taskList.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new DukeException("☹ OOPS!!! Invalid task number.");
        }
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void deleteTask(int i) throws DukeException {
        try {
            taskList.remove(i);
        } catch (IndexOutOfBoundsException e) {
            throw new DukeException("☹ OOPS!!! Invalid task number.");
        }
    }
}
