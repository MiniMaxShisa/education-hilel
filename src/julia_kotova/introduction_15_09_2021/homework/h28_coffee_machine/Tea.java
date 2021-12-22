package julia_kotova.introduction_15_09_2021.homework.h28_coffee_machine;

import static julia_kotova.introduction_15_09_2021.homework.h28_coffee_machine.DrinkType.TEA;

public class Tea extends CoffeeMachine {

    public int price = 25;

    public int getPrice() {
        return price;
    }

    @Override
    public void prepare() {
        System.out.println("doing " + TEA.getName() + "...");
    }

}
