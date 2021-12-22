package julia_kotova.introduction_15_09_2021.classwork.l11_classes;

public class Dog {

    // поля
    public String name;
    int age;

    // конструкторы
    public Dog() {
        System.out.println("Dog is created.");
    } // конструктор по умолчанию (без параметров)

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // методы
    public void run() {
        System.out.println(this.name + " is running.");
        System.out.println();
    }

    @Override // аннотация
    public String toString() {
        return "Dog: " + this.name + ", " + this.age + " years.";
    }

    @Override // переопределение alt + insert
    public boolean equals(Object obj) {

        if (!(obj instanceof Dog dog)) {
          return false;
        }
        return this.name.equals(dog.name) && this.age == dog.age;

    }

}
