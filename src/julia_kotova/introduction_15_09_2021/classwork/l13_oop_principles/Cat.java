package julia_kotova.introduction_15_09_2021.classwork.l13_oop_principles;

public class Cat extends Animal {

    public Cat(String name) {
        super(name); // int n = super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks 'Meow'");
    }

}
