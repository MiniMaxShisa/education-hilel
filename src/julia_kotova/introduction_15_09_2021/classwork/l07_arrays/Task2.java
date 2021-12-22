package julia_kotova.introduction_15_09_2021.classwork.l07_arrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array size: ");
        int size = scanner.nextInt();
        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("array contents: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

}
