package julia_kotova.introduction_15_09_2021.classwork.l12_classes;

public class NullTest {

    public static void main(String[] args) {

        Person person = null;
        Person person1 = new Person("Lee", 35);

        if (person != null) {
            System.out.println(person.equals(person1));
        } else {
            System.out.println("Person does not exist.");
        }

        System.out.println("person name: " + person1.getName());
        System.out.println("person1 age: " + person1.getAge());

        person1.setAge(36);
        person1.setName("Leen");

        System.out.println("person1 name: " + person1.getName());
        System.out.println("person1 age: " + person1.getAge());

        // Person.birthday(); через static
        person1.birthday();
        System.out.println("person1 age: " + person1.getAge());

        Person.printCount();

    }

}
