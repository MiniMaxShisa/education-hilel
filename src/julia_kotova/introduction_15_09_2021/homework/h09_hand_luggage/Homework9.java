package julia_kotova.introduction_15_09_2021.homework.h09_hand_luggage;

import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Submit width:");
        int width = scanner.nextInt();
        System.out.println("Submit length:");
        int length = scanner.nextInt();
        System.out.println("Submit height:");
        int height = scanner.nextInt();

        if (width <= 20 && length <= 55 && height <= 40) {
            System.out.println("You can take this bag on the plane.");
        } else if (width <= 22 && length <= 40 && height <= 53) {
            System.out.println("You can take this bag on the plane.");
        } else {
            System.out.println("You can't take this bag on the plane.");
        }

    }

}
