package oop;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class SkillFactory {

    public static void main(String[] args) {

        int randNum = randomNumbers();
        String text = randomStrings();

        // Different types of the Tasks
        Test test = new Test(randNum, text);
        DragAndDrop dragAndDrop = new DragAndDrop(randNum, text);
        Code code = new Code(randNum, text);

        // Array of the Tasks
        Task[] tasks = tasksList(test, dragAndDrop, code);

        int allTasksNeedToSolve = tasksList(test, dragAndDrop, code).length;

        // Mentors
        Mentor nikitaKatyshev = new Mentor("Nikita Katyshev", 25);
        Mentor kristinaChomiak = new Mentor("Kristina Chomiak", 21);

        // Students
        Student konstantinFalkovskis = new Student("Konstantin Falkovskis", 37, allTasksNeedToSolve, false, nikitaKatyshev);
        Student irinaBalyka = new Student("Irina Balyka", 29, allTasksNeedToSolve, false, kristinaChomiak);
        Student ksenijaTavrel = new Student("Ksenija Tavrel", 22, allTasksNeedToSolve, false, kristinaChomiak);
        Student pavelYanovsky = new Student("Pavel Yanovsky", 52, allTasksNeedToSolve, false, nikitaKatyshev);

        // Array of students
        Student[] studentsArray = new Student[]{konstantinFalkovskis, irinaBalyka, ksenijaTavrel, pavelYanovsky};

        int[] arr = solveTasks(studentsArray, allTasksNeedToSolve, tasks);

        // Count of the solved tasks by all students
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        System.out.println("\nTasks were passed by all students: " + result);
    }

    // Solving tasks according students array
    public static int[] solveTasks(Student[] studentsArray, int allTasksNeedToSolve, Task[] tasks) {
        int[] arr = new int[studentsArray.length];
        // Solving tasks according students array
        for (int i = 0; i < studentsArray.length; i++) {
            int tasksCountToSolve = randomNumbers();
            System.out.println("\n==========================================================================");
            System.out.println(i + 1 + " Student " + studentsArray[i].getName() + " must to solve "
                    + tasksCountToSolve + " task from " + allTasksNeedToSolve);
            System.out.println("==========================================================================\n");
            while (!studentsArray[i].solveAllTasks(tasksCountToSolve, tasks)) {
                studentsArray[i].solveAllTasks(tasksCountToSolve, tasks);
            }
            arr[i] = studentsArray[i].getAllPassedTasks();
        }
        return arr;
    }

    /**
     * Integers random generator
     *
     * @return
     */
    public static int randomNumbers() {
        Random random = new Random();
        random.nextInt();
        int min = 1;
        int max = 39;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    /**
     * Random string generator with Apach Common lang 3.11
     *
     * @return
     */
    public static String randomStrings() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
//        String geNum = RandomStringUtils.randomAlphanumeric(17).toUpperCase();
        return generatedString;
    }

    /**
     * Random boolean value generator
     *
     * @return
     */
    public static boolean randomBoolean() {
        boolean isVal = false;
        if (randomNumbers() % 2 == 0) {
            isVal = true;
        } else {
            isVal = false;
        }
        return isVal;
    }

    public static Task[] tasksList(Test test, DragAndDrop dragAndDrop, Code code) {
        int randNum = randomNumbers();
        Task[] tasks = new Task[40];
        for (int i = 0; i < 40; i++) {
            randNum = randomNumbers();
            if (randNum <= 15) {
                tasks[i] = test;
            } else if (randNum > 16 && randNum < 35) {
                tasks[i] = dragAndDrop;
            } else {
                tasks[i] = code;
            }
        }
        return tasks;
    }
}
