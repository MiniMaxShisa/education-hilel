package julia_kotova.introduction_15_09_2021.classwork.l05_if_else_switch;

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input number:");

        int number = in.nextInt();
        System.out.println("you input " + number);

        if (number == 0) {
            System.out.println(number + " = 0");
        } else {
            System.out.println(number + " != 0");
        }

        System.out.println("end");

    }

}
