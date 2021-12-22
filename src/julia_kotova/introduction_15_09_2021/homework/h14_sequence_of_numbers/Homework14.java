package julia_kotova.introduction_15_09_2021.homework.h14_sequence_of_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework14 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Внесите количество чисел:");
        int arraySize = Integer.parseInt(reader.readLine());
        System.out.println("Внесите числа:");
        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Ваша последовательность: " + Arrays.toString(numbers));

        boolean test = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                test = false;
                break;
            }
        }

        if (test) {
            System.out.println("Последовательность чисел является строго возрастающей.");
        } else {
            Arrays.sort(numbers);
            System.out.println("Последовательность чисел не является строго возрастающей.");
            System.out.println("Правильная последовательность: " + Arrays.toString(numbers));
        }

    }

}

