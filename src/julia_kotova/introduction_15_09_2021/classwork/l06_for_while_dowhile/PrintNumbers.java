package julia_kotova.introduction_15_09_2021.classwork.l06_for_while_dowhile;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // input == "stop"

        while (!input.equals("stop")) {
            System.out.println("you input: " + input);
            input = scanner.nextLine();
        }

        /*
        while (!(input = scanner.nextLine()).equals("stop")) {
            System.out.println("you input: " + input);
        }

        while (!(input = scanner.nextLine()).equals("stop")) {
            int number = Integer.parseInt(input);
            System.out.println("you input number: " + number);
        }
        */

        System.out.println("ok");

    }

}
