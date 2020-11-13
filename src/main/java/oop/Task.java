package oop;

/**
 * Task (Абстрактный класс)
 *
 * Класс описывает задачу, которая даётся студенту для решения. Во всех заданиях по желанию вы можете
 * реализовать свой собственный конструктор и инициализировать задание с его помощью.
 */

abstract class Task {

    /**
     * Номер
     * ➜ Тип поля int
     */
    private int number;

    /**
     * Текст задание
     * ➜ Тип поля String
     */
    private String taskText;

    /**
     * Конструктор по умолчанию присваивает полям значение 0 и любой текст
     */
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
