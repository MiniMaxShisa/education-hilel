package julia_kotova.introduction_15_09_2021.classwork.l13_oop_principles;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " speaks");
    }

}
