package oop;

/**
 * Code (Наследник Task)
 */

public class Code extends Task {

    /**
     * Поля
     * ✷ Текст кода
     *      ➜ Тип поля String
     */
    private String code;

    /**
     * Конструктор по умолчанию вызывает конструктор родителя и присваивает полю строку на ваше усмотрение
     */
    public Code(int number, String taskText) {
        super(number, taskText);
        this.code = "Code test body";
    }

//    @Override
//    public String toString() {
//        return "Code{" +
//                "code='" + code + '\'' +
//                "} " + super.toString();
//    }
}
