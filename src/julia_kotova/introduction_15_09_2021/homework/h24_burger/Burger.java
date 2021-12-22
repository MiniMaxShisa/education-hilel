package julia_kotova.introduction_15_09_2021.homework.h24_burger;

public class Burger {

    String name;
    public int bun;
    public int meat;
    public int cheese;
    public int herbs;
    public int mayonnaise;

    public Burger() {
    }

    public Burger(String name, int bun, int meat, int cheese, int herbs, int mayonnaise) {

        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;

        System.out.println(this);

    }

    public Burger(String name, int bun, int meat, int cheese, int herbs) {

        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;

        System.out.println(this);

    }


    @Override
    public String toString() {

        String[] ingredients = {"булочка", "мясо", "сыр", "зелень", "майонез"};

        return this.name + " (состав: " +
                ingredients[0] + " - " + this.bun + " пор., " +
                ingredients[1] + " - " + this.meat + " пор., " +
                ingredients[2] + " - " + this.cheese + " пор., " +
                ingredients[3] + " - " + this.herbs + " пор., " +
                ingredients[4] + " - " + this.mayonnaise + " пор.)";

    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Burger burger)) {
            return false;
        }
        return this.bun == burger.bun && this.meat == burger.meat && this.cheese == burger.cheese && this.herbs == burger.herbs && this.mayonnaise == burger.mayonnaise;

    }

    public static void compareName (Burger burger, Burger burger2) {

        String massage = "Обнаружено повторяющееся наименование: " + burger.name + "!";

        if (burger.equals(burger2)) {
            System.out.println(massage);
        }

    }

    public static void compareRecipe (Burger burger, Burger burger2) {

        String massage1 = burger.name + " и " + burger2.name + " имеют одинаковый состав!";
        String massage2 = burger.name + " и " + burger2.name + " имеют разный состав.";

        if (burger.equals(burger2)) {
            System.out.println(massage1);
        } else {
            System.out.println(massage2);
        }

    }

}
