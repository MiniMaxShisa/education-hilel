package julia_kotova.introduction_15_09_2021.homework.h22_recursion_factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework22 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");
        int input = Integer.parseInt(reader.readLine());
        check(input);

    }

    public static void check(int input) {

        if (input <= 0) {
            System.out.println("Недопустимое число!");
        } else {
            System.out.println("Факториал числа " + input + ": " + calculateFactorial(input));
        }

    }

    public static long calculateFactorial(int number) {

        if (number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }

    }

}
