package julia_kotova.introduction_15_09_2021.classwork.l13_oop_principles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PetStore {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Pixel"));
        animals.add(new Dog("Ted"));
        animals.add(new Parrot("Bob"));

        String input;

        while (!(input = bufferedReader.readLine()).equals("exit")) {

            Animal animal;
            String name;

            switch (input) {
                case "cat":
                    System.out.println("Input cat name: ");
                    name = bufferedReader.readLine();
                    animal = new Cat(name);
                    animals.add(animal);
                    break;
                case "dog":
                    System.out.println("Input dog name: ");
                    name = bufferedReader.readLine();
                    animal = new Dog(name);
                    animals.add(animal);
                    break;
                case "parrot":
                    System.out.println("Input parrot name: ");
                    name = bufferedReader.readLine();
                    animal = new Parrot(name);
                    animals.add(animal);
                    break;
                default:
                    System.out.println("Unknown animal type: " + input);
            }

        }

        for (Animal animal : animals) {
            animal.speak();
        }

    }

}
