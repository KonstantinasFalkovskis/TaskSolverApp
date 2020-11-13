package oop;

import java.util.Random;

public class Mentor extends Person implements Staff, SimpleInterface {

    private boolean isMood;
    private Random random;

    public Mentor() {
        this.isMood = true;
    }

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
            System.out.println("The task is accepted and passed");
            isPassed = true;
        } else {
            isPassed = false;
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
