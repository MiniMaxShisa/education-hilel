package julia_kotova.introduction_15_09_2021.classwork.l12_classes;

public class Person {

    // статические переменные
    public static int COUNT;

    // поля: private
    private String name;
    private int age;

    // конструктор по умолчанию
    public Person() {
    }

    // конструкторы
    public Person(String name) {

        this.name = name;
        System.out.println(this);
        COUNT++;

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        System.out.println(this);
        COUNT++;

    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // переопределение
    @Override
    public String toString() {
        return "Person: " + this.name + ", " + this.age + " years.";
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Person person)) {
            return false;
        }
        return this.age == person.age;

    }

    // методы
    public static void compareAge(Person person1, Person person2) {

        String massage = person1.name + " и " + person2.name + " имеют одинаковый возраст: " + person1.age + " years.";

        if (person1.equals(person2)) {
            System.out.println(massage);
        }

    }

    public void birthday() {

        this.age += 1;
        System.out.println("Happy Birthday, " + this.name + "!");

    }

    public static void printCount() {

        // System.out.println(person.COUNT); - bad style
        System.out.println("Persons: " + Person.COUNT);

    }

}
