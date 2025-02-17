public class MyClass {

    String name;
    String surName;
    int age;
    String[] lesson;
    String foot;

    public MyClass(String name, String surName, int age, String[] lesson, String foot) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.lesson = lesson;
        this.foot = foot;
    }

    public MyClass(String surName, String name, int age, String[] lesson) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }
}
