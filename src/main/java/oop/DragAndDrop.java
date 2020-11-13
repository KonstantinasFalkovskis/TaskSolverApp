package oop;

public class DragAndDrop extends Task implements Autochecked {

    private String[][] possibleAnswers;

    public DragAndDrop(int number, String taskText) {
        super(number, taskText);
        this.possibleAnswers = new String[][]{{"1", "One"}, {"2", "Two"}, {"3", "Tree"}};
    }
}
