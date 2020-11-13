package oop;

interface Staff {

    void helpsStudent(Student student);

    boolean codeReview(Task task);

    default void provideAdditionalMaterials() {
        System.out.println("Please check additional information and reach the materials in the internet source\n\t http://www.habr.ru ");
    }
}
