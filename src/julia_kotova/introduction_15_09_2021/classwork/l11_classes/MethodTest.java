package julia_kotova.introduction_15_09_2021.classwork.l11_classes;

public class MethodTest {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("number in main: " + number);

        testPrimitive(number);

        System.out.println("number in main after method call: " + number);

        System.out.println();

        Dog dog = new Dog();
        dog.name = "Ted";

        System.out.println("dog in main: " + dog.name);

        testObject(dog);

        System.out.println("dog in main after method call: " + dog.name);

    }

    public static void testPrimitive(int number) {

        System.out.println("number in method: " + number);

        number *= 2;

        System.out.println("number in method after modification: " + number);

    }

    public static void testObject(Dog dog) {

        System.out.println("dog in method: " + dog.name);

        dog.name += " new"; // dog.name = dog.name + " new";

        System.out.println("dog in method after modification: " + dog.name);

    }

}
