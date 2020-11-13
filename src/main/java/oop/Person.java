package oop;

/**
 * Person
 * Этот класс описывает человека и содержит его основные свойства. Ниже описаны характеристика класса.
 */
public class Person {

    /**
     * ✷ Имя (Фамилия и Имя)
     * ➜ Тип поля String
     */
    private String name;

    /**
     * Возраст
     * ➜ Тип поля int
     */
    private int age;

    public Person() {

    }

    /**
     * Конструктор для всех полей
     *
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
