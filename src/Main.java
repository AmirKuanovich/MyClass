import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Amir", "Altymyshev", 18, new String[]{"Java", "English", "Soft"}, "Hamburger");

        System.out.println("Me -> ");
        System.out.println("{ Name : " + myClass.name);
        System.out.println("Surname : " + myClass.surName);
        System.out.println("Age : " + myClass.age);
        System.out.println("Lesson : " + Arrays.toString(myClass.lesson));
        System.out.println("My favorite foot : " + myClass.foot + " } ");

        System.out.println("\n-------------------------------\n");

        MyClass myClass1 = new MyClass("Altymyshev", "Amir", 18, new String[]{"Java", "JS", "C++", "C#"});

        System.out.println("Me -> ");
        System.out.println("{ Surname : " + myClass1.surName);
        System.out.println("Name : " + myClass1.name);
        System.out.println("Age : " + myClass1.age);
        System.out.println("Lesson : " + Arrays.toString(myClass1.lesson) + " } ");
    }
}