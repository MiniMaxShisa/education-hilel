package julia_kotova.introduction_15_09_2021.classwork.l05_if_else_switch;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input your score:");

        int score = in.nextInt();

        if (score > 999) {
            System.out.println("you can get 50000$");
        } else if (score < 1000 && score > 499) {
            System.out.println("you can get 20000$");
        } else if (score < 500 && score > 99) {
            System.out.println("you can get 10000$");
        } else if (score < 100) {
            System.out.println("you can't get money");
        }

    }

}
