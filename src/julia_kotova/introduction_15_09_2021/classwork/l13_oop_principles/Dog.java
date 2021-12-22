package julia_kotova.introduction_15_09_2021.classwork.l13_oop_principles;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks 'Woof'");
    }

}
