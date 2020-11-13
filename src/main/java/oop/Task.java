package oop;

abstract class Task {

    private int number;
    private String taskText;

    public Task() {
        number = 0;
        taskText = "Any text";
    }

    public Task(int number, String taskText) {
        this.number = number;
        this.taskText = taskText;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}
