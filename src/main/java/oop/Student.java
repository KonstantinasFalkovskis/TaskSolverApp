package oop;

public class Student extends Person implements Autochecked {

    private int passedTasksCount;
    private int tasksCountForAllStudents;
    private int allPassedTasks;
    boolean isModulePassed;
    Mentor mentor;

    public Student() {
    }

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

    public boolean solveAllTasks(int tasksCount, Task[] tasks) {
        isModulePassed = false;
        while (!this.isModulePassed) {
            for (int i = 1; i <= tasksCount; i++) {
                solveTask(tasks[i], i);
                if (passedTasksCount == tasksCount) {
                    isModulePassed = true;
                    System.out.println("All tasks are passed, module is finished!\n");
                    System.out.println("Tasks were passed by student " + getName() + " is " + getPassedTasksCount());
                } else {
                    isModulePassed = false;
                    System.out.println("Module is not completed!\n");
                }
            }
        }
        return isModulePassed;
    }

    private void solveTask(Task task, int index) {
        boolean isTaskPassed = false;
        while (!isTaskPassed) {
            if (taskAutochecking(index) == true) {
                passedTasksCount += 1;
                allPassedTasks += 1;
                System.out.println(getPassedTasksCount() + " tasks passed after auto-check for student " + getName());
                isTaskPassed = true;
            } else {
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
