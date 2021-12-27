package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t01_human;

import java.util.Objects;

public class Human {

    public String name;
    public String secondName;
    public String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String secondName, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getFullName() {

        String newSecondName = "";

        if (secondName != null) {
            newSecondName = secondName;
        }

        return surname + " " + name + " " + newSecondName;

    }

    public String getShortName() {

        String newSecondName = "";

        if (secondName != null) {
            newSecondName = " " + secondName.charAt(0) + ".";
        } else {
            System.out.println();
        }

        return surname + " " + name.charAt(0) + "." + newSecondName;

    }

    @Override
    public String toString() {
        return "Name: " + name + secondName + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }

}
