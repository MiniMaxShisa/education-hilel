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

        return this + newSecondName;
    }

    public String getShortName() {
        String newSecondName = "";
        String newName = " " + name.charAt(0) + ".";

        if (secondName != null) {
            newSecondName = " " + secondName.charAt(0) + ".";
        }

        return surname + newName + newSecondName;
    }

    @Override
    public String toString() {
        return surname + " " + name + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(secondName, human.secondName) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, surname);
    }

}
