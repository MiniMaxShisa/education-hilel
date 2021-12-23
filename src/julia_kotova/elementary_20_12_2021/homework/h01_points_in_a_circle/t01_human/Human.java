package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t01_human;

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

}
