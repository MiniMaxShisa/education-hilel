package julia_kotova.introduction_15_09_2021.homework.h28_coffee_machine;

public class Americano extends CoffeeMachine {

    public int price = 30;

    public int getPrice() {
        return price;
    }

    @Override
    public void prepare() {
        System.out.println("doing " + DrinkType.AMERICANO.getName() + "...");
    }

}
