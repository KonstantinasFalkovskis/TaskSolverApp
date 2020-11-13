package oop;

/**
 * Autochecked
 *
 * Используются, чтобы отметить задания, которые проверяются автоматически.
 */
public interface Autochecked {

    /**
     * Методы
     * ✷ default метод Выполнить задание
     * Без аргументов
     * Тип возвращаемого значения
     * ➜ void
     * Печатает сообщение о том, что задание выполнено
     */
    default boolean taskAutochecking(int number) {
        boolean isAutocheck = false;
        if (number % 2 == 0) {
            isAutocheck = true;
        } else {
            isAutocheck = false;
        }
//        System.out.println("The task is completed!!!");
        return isAutocheck;
    }


}
