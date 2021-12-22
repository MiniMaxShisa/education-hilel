package julia_kotova.introduction_15_09_2021.homework.h26_dog;

public class DogMain {

    public static void main(String[] args) {

        System.out.println("Dogs:");

        Dog dog1 = new Dog("Foxy", "Australian Shepherd", 5, 25.5);
        Dog dog2 = new Dog("Xin", "Beagle", 3, 14.2);
        Dog dog3 = new Dog("Ted", "Bulldog", 5, 25.5);

        Dog.printCount();

        Dog.compareAgeWeight(dog1, dog2);
        Dog.compareAgeWeight(dog1, dog3);
        Dog.compareAgeWeight(dog2, dog3);

    }

}
