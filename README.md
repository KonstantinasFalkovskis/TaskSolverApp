# Skill Factory

<h1> Students tasks solver application</h1>

- OOP principles were implemented (incapsulation, polimorphism, inheritance);
- Abstractions and Interfaces also are using;

+ Application logic:
  + Tasks abstract class created: 
    + DragAndDrop, Code, Test tasks inherits Task.class beheviour;
  + Parent Person.class:
    + Student.class and Mentor.class inherits parent class behaviour;
  + In SkillFactory.class main method Tasks, Students, Mentors arrays are creating;     
  + In SkillFactory.class main method common logig for tasks solving is calling from Student.class;

```Java
    public static int[] solveTasks(Student[] studentsArray, int allTasksNeedToSolve, Task[] tasks) {
        int[] arr = new int[studentsArray.length];
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
```

<h2>How to run application</>

+ Application can be runned from IntelliJ IDE by pressing SHIFT+F10 or from main menu 'RUN' -> 'Run Project';
