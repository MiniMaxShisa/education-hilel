package julia_kotova.introduction_15_09_2021.homework.h28_coffee_machine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachineMain {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<CoffeeMachine> drinks = new ArrayList<>();

        String input;

        System.out.println("Choose drinks. Write 'READY' when the list is complete.");

        while (!(input = reader.readLine()).equals("READY")) {

            try {

                if (!(DrinkType.valueOf(input) == DrinkType.AMERICANO || DrinkType.valueOf(input) == DrinkType.CAPPUCCINO || DrinkType.valueOf(input) == DrinkType.LATTE || DrinkType.valueOf(input) == DrinkType.TEA)) {
                    throw new Exception();
                }

                CoffeeMachine drink;

                switch (DrinkType.valueOf(input)) {
                    case AMERICANO -> {
                        drink = new Americano();
                        drinks.add(drink);
                        System.out.println("Anything else?");
                    }
                    case CAPPUCCINO -> {
                        drink = new Cappuccino();
                        drinks.add(drink);
                        System.out.println("Anything else?");
                    }
                    case LATTE -> {
                        drink = new Latte();
                        drinks.add(drink);
                        System.out.println("Anything else?");
                    }
                    case TEA -> {
                        drink = new Tea();
                        drinks.add(drink);
                        System.out.println("Anything else?");
                    }

                }

            } catch (Exception e) {
                System.out.println("We don't have such a drink.");

            }

        }

        int sumOrder = 0;

        for (CoffeeMachine drink : drinks) {
            int price = drink.getPrice();
            sumOrder = sumOrder + price;
        }

        System.out.println("The amount of your order: " + sumOrder);

        for (CoffeeMachine drink : drinks) {
            drink.prepare();
        }

        System.out.println("Your order is ready.");

    }

}
