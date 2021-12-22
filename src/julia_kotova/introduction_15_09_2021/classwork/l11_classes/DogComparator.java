package julia_kotova.introduction_15_09_2021.classwork.l11_classes;

public class DogComparator {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bax", 5);
        Dog dog3 = new Dog("Hunter", 8);
        Dog dog4 = new Dog("Bax", 5);

        System.out.println(dog1);
        System.out.println(dog1);
        System.out.println(dog3);

        compare(dog1, dog1, "dog1 == dog2: Links are equal", "dog1.equals(dog2): Values are equal");
        compare(dog1, dog3, "dog1 == dog3: Links are equal", "dog1.equals(dog3): Values are equal");
        compare(dog1, dog4, "dog1 == dog4: Links are equal", "dog1.equals(dog4): Values are equal");

    }

    public static void compare (Dog dog1, Dog dog2, String massage1, String massage2) {

        if (dog1 == dog2) {
            System.out.println(massage1);
        }

        if (dog1.equals(dog2)) {
            System.out.println(massage2);
        }

    }

}
