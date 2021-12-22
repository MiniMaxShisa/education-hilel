package julia_kotova.introduction_15_09_2021.classwork.l05_if_else_switch;

import java.util.Scanner;

public class Employee {

    public static final int MONTH_IN_YEAR = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input your salary");
        int salary = scanner.nextInt();
        System.out.println("input your experience");
        int experience = scanner.nextInt();

        int total = salary * MONTH_IN_YEAR;
        if (experience >= 5) {
            total += 100;
            // total = total + 100;
        }

        System.out.println("you will get " + total + "$");

    }

}
