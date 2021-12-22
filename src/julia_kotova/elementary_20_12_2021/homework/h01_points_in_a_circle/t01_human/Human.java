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

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void getFullName() {

        System.out.print(this.getSurname() + " " + this.getName());

        if (secondName != null) {
            System.out.println(" " + secondName);
        } else {
            System.out.println();
        }

    }

    public void getShortName() {

        System.out.print(this.getSurname() + " " + this.getName().charAt(0) + ".");

        if (secondName != null) {
            System.out.println(" " + secondName.charAt(0) + ".");
        } else {
            System.out.println();
        }

    }

}
