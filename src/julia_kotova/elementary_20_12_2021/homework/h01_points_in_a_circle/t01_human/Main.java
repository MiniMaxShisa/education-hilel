package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t01_human;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Elise", "Storm");
        Human human2 = new Human("Jack", "James", "Frost");

        System.out.println(human1.getFullName());
        System.out.println(human2.getFullName());

        System.out.println(human1.getShortName());
        System.out.println(human2.getShortName());

    }

}
