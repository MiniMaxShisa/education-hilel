package julia_kotova.introduction_15_09_2021.classwork.l11_classes;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Star";
        dog.age = 3;

        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age + " years");

        dog.run();

        Dog dog2 = new Dog();

        dog2.name = "Pixie";
        dog2.age = 4;

        System.out.println("Name: " + dog2.name);
        System.out.println("Age: " + dog2.age + " years");

    }

}
