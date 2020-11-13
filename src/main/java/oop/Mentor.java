package oop;

import java.util.Random;

/**
 * Mentor (наследник Person, реализует Staff)
 * Этот класс описывает ментора, который проверяет задания студента,
 * отвечает на вопросы и делится дополнительными материалами.
 */

public class Mentor extends Person implements Staff, SimpleInterface {

    /**
     * Настроение ментора
     * ➜ Тип поля boolean
     */
    private boolean isMood;

    /**
     * Константа рандома (пример ниже)
     * ➜ Тип поля Random
     */
    private Random random;

    public Mentor() {
        this.isMood = true;
    }

    /**
     * ✷ По умолчанию вызывает родительский конструктор и присваивает ментору хорошее настроение
     *
     * @param name
     * @param age
     */
    public Mentor(String name, int age) {
        super(name, age);
    }

    public boolean isMood() {
        return isMood;
    }

    public void setMood(boolean mood) {
        isMood = mood;
    }

    @Override
    public void helpsStudent(Student student) {
        System.out.println("Keep doing. Move forward! Everything will be good!!! " + student.getName());
    }


    @Override
    public boolean codeReview(Task task) {
        boolean isPassed = false;
        if (randomNumbers() > 1000) {
            /**
             * напечатать сообщение о том, что задача принята и вернуть true.
             */
            System.out.println("The task is accepted and passed");
            isPassed = true;
        } else {
            isPassed = false;
            /**
             * Если у ментора плохое настроение, то он задачу не принимает. Должно быть напечатано сообщение о том,
             * что задача (в сообщении указать номер задачи) не принято и вернуть false.
             */
            System.out.println("The task number " + task.getNumber() + " is failed. Please solve task again!");
        }
        return isPassed;
    }

    /**
     * Integers random generator
     *
     * @return
     */
    public int randomNumbers() {
        //Random используется для генерации случайных чисел
        random = new Random();
        random.nextInt(); //любое случайное число
        int min = 1;
        int max = 40;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

}
