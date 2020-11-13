package oop;

/**
 * DragAndDrop (Наследник Task, реализует интерфейс Autochecked)
 */

public class DragAndDrop extends Task implements Autochecked {

    /**
     * Поля
     * ✷ Массив с вариантами
     *      ➜ Тип поля двумерный массив строк
     */
    private String[][] possibleAnswers;

    /**
     * Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку
     * на новый двумерный массив, заполненный значениями по вашему усмотрению
     */
    public DragAndDrop(int number, String taskText) {
        super(number, taskText);
        this.possibleAnswers = new String[][]{{"1","One"},{"2","Two"},{"3","Tree"}};
    }
}
