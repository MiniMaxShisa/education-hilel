package julia_kotova.introduction_15_09_2021.homework.h28_coffee_machine;

public enum DrinkType {

    AMERICANO("AMERICANO"),
    CAPPUCCINO("CAPPUCCINO"),
    LATTE("LATTE"),
    TEA("TEA");

    private final String name;

    DrinkType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
