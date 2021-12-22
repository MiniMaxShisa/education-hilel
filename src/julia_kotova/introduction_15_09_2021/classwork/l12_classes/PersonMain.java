package julia_kotova.introduction_15_09_2021.classwork.l12_classes;

public class PersonMain {

    public static void main(String[] args) {

        Person personTest = new Person("Test");
        Person person1 = new Person("Jack", 20);
        Person person2 = new Person("Jhon", 20);
        Person person3 = new Person("Mary", 19);

        System.out.println();
        Person.compareAge(person1, person2);
        Person.compareAge(person2, person3);
        Person.compareAge(person3, person1);

    }

}
