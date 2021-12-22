package julia_kotova.introduction_15_09_2021.homework.h26_dog;

public class Dog {

    public static int COUNT;

    private String name;
    private String breed;
    private int age;
    private double weight;

    public Dog() {
    }

    public Dog(String name, String breed, int age, double weight) {

        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        COUNT++;
        System.out.println(this);

    }

    public String getName(String name) {
        return name;
    }

    public String getBreed(String breed) {
        return breed;
    }

    public int getName(int age) {
        return age;
    }

    public double getName(double weight) {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(int age) {
        this.age = age;
    }

    public void setName(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {

        return name + ", "
                + breed + ", "
                + age + " years, "
                + weight + "kg";

    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Dog dog)) {
            return false;
        }
        return this.age == dog.age && this.weight == dog.weight;

    }

    public static void printCount() {
        System.out.println("Amount of dogs: " + Dog.COUNT);
        System.out.println();
    }

    public static void compareAgeWeight (Dog dog, Dog dog2) {

        String massage1 = dog.name + ", " + dog.breed + " and "
                + dog2.name + ", " + dog2.breed + " have the same age and weight: "
                + dog.age + " years, " + dog.weight + " kg.";

        if (dog.equals(dog2)) {
            System.out.println(massage1);
        }

    }

}
