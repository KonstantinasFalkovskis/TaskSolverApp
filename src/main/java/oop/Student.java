package oop;

/**
 * Student (наследник Person)
 * Этот класс описывает студента и логику для работы с ним.
 */
public class Student extends Person implements Autochecked {

    /**
     * ✷ Количество решенных задач
     * ➜ Тип поля int
     */
    private int passedTasksCount;

    /**
     * Количество решенных задач всеми студентами
     * ➜ Статическое поле типа int
     */
    private int tasksCountForAllStudents;

    private int allPassedTasks;

    /**
     * Флаг, что студент решил все задания
     * ➜ Тип поля boolean
     */
    boolean isModulePassed;

    /**
     * Ментор
     * ➜ Тип поля Mentor
     */
    Mentor mentor;

    public Student() {
    }

    /**
     * Конструктор для всех полей, кроме количества решенных задач (оно для каждого нового студента равно 0)
     *
     * @param name
     * @param age
     * @param tasksCountForAllStudents
     * @param isModulePassed
     * @param mentor
     */
    public Student(String name, int age, int tasksCountForAllStudents, boolean isModulePassed, Mentor mentor) {
        super(name, age);
        this.tasksCountForAllStudents = tasksCountForAllStudents;
        this.isModulePassed = isModulePassed;
        this.mentor = mentor;
    }

    public int getPassedTasksCount() {
        return passedTasksCount;
    }

    public void setPassedTasksCount(int passedTasksCount) {
        this.passedTasksCount = passedTasksCount;
    }

    public int getTasksCountForAllStudents() {
        return tasksCountForAllStudents;
    }

    public void setTasksCountForAllStudents(int tasksCountForAllStudents) {
        this.tasksCountForAllStudents = tasksCountForAllStudents;
    }

    public boolean isModulePassed() {
        return isModulePassed;
    }

    public void setModulePassed(boolean modulePassed) {
        isModulePassed = modulePassed;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public int getAllPassedTasks() {
        return allPassedTasks;
    }

    public void setAllPassedTasks(int allPassedTasks) {
        this.allPassedTasks = allPassedTasks;
    }

    /**
     * Метод - решить все задачи
     * Публичный
     * Аргументы
     * ➜ Число задач (число задач, которые он должен решить) типа int и массив с заданиями типа Task
     * Возвращаемое значение
     * ➜ void
     * ***************
     * Логика работы
     * ***************
     * ➜ Студенту передаётся число задач, которые он должен решить и ссылка на массив с заданиями
     * ➜ У студента есть количество задач, которые он уже решил, а значит вы можете вычислить,
     * с какой задачи начинать решение.
     * ➜ Для решения задач студент вызывает метод Решить задачу.
     * ➜ Если студент решил все задачи из массива, то напечатать об этом сообщение и выставить true
     * в соответствующее поле
     * ➜ Иначе напечатать сообщение о том, что не все задачи решены и вернуть false
     *
     * @param tasksCount
     * @param tasks
     * @return
     */
    public boolean solveAllTasks(int tasksCount, Task[] tasks) {
        isModulePassed = false;
        while (!this.isModulePassed) {
            for (int i = 1; i <= tasksCount; i++) {
                solveTask(tasks[i], i);
                if (passedTasksCount == tasksCount) {
                    isModulePassed = true;
                    System.out.println("All tasks are passed, module is finished!\n");
                    System.out.println("Tasks were passed by student " + getName() + " is " + getPassedTasksCount());
//                    System.out.println("Tasks were passed by All students " + getAllPassedTasks());
                    passedTasksCount = 0;
//                    break;
                } else {
                    isModulePassed = false;
                    System.out.println("Module is not completed!\n");
                }
            }
        }
        return isModulePassed;
    }

    /**
     * Метод - решить конкретную задачу
     * Приватный
     * Аргументы
     * ➜ Задание, тип Task
     * Возвращаемое значение
     * ➜ void
     * *****************
     * Логика работы
     * *****************
     * Если задание проверяется автоматически, то напечатать сообщение о том, что задание выполнено
     * и закончить работу метода
     * Иначе отправлять ментору задание на проверку до тех пор, пока оно не будет зачтено
     * Не забудьте увеличить число решенных студентом и всеми студентами задач
     *
     * @param task
     */
    private void solveTask(Task task, int index) {
        boolean isTaskPassed = false;

        while (!isTaskPassed) {
            if (taskAutochecking(index) == true) {
                passedTasksCount += 1;
                allPassedTasks += 1;
                System.out.println(getPassedTasksCount() + " tasks passed after auto-check for student " + getName());
                isTaskPassed = true;
            } else {
                // Oтправлять ментору задание на проверку до тех пор, пока оно не будет зачтено
                do {
                    passedTasksCount += 1;
                    allPassedTasks += 1;
                    isTaskPassed = false;
                    System.out.println(getPassedTasksCount() + " tasks passed after mentor's check for student " + getName());
                } while (mentor.isMood());
                isTaskPassed = true;
            }
        }
    }

}
