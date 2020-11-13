package oop;

public class Test extends Task implements Autochecked {

    private String[] answers;

    public Test(int number, String taskText) {
        super(number, taskText);
        this.answers = new String[]{"Yes", "No", "Both"};
    }
}
