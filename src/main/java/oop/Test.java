package oop;

/**
 * Test (Наследник Task, реализует интерфейс Autochecked)
 */

public class Test extends Task implements Autochecked {

    /**
     * Поля
     * ✷ Массив с ответами
     *      ➜ Тип поля массив строк
     */
    private String[] answers;
    /**
     * Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку на массив {“a”, “b”, “c”}
     */
    public Test(int number, String taskText) {
        super(number, taskText);
        this.answers = new String[]{"Yes","No","Both"};
    }


}
