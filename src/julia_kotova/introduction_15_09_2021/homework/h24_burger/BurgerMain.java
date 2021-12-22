package julia_kotova.introduction_15_09_2021.homework.h24_burger;

public class BurgerMain {

    public static void main(String[] args) {

        System.out.println("Меню:");
        Burger regularBurger = new Burger("Обычный бургер", 1, 1, 1, 1, 1);
        Burger dietBurger = new Burger("Диетический бургер", 1, 1, 1, 1);
        Burger doubleMeatBurger = new Burger("Бургер с двойным мясом", 1, 2, 1, 1, 1);
        Burger testBurger = new Burger("Обычный бургер", 1, 1, 1, 1, 1);

        System.out.println();
        System.out.println("Проверка на совпадения наименования:");
        Burger.compareName(regularBurger, dietBurger);
        Burger.compareName(dietBurger, doubleMeatBurger);
        Burger.compareName(doubleMeatBurger, regularBurger);
        Burger.compareName(regularBurger, testBurger);
        System.out.println("Проверка пройдена.");

        System.out.println();
        System.out.println("Проверка на совпадения в рецептах:");
        Burger.compareRecipe(regularBurger, dietBurger);
        Burger.compareRecipe(dietBurger, doubleMeatBurger);
        Burger.compareRecipe(doubleMeatBurger, regularBurger);
        Burger.compareRecipe(regularBurger, testBurger);
        System.out.println("Проверка пройдена.");

    }

}
