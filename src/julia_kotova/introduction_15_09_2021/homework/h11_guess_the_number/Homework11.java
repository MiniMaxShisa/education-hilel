package julia_kotova.introduction_15_09_2021.homework.h11_guess_the_number;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the whole number from 1 to 10:");
        int number = scanner.nextInt();

        while (number != random) {
                System.out.println("Nope!");
                number = scanner.nextInt();
            }

        System.out.println("That's it!");

    }

}
