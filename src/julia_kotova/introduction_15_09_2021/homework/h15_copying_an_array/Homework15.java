package julia_kotova.introduction_15_09_2021.homework.h15_copying_an_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework15 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Внесите 20 чисел массива:");
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int[] numbers2 = new int[10];
        int[] numbers3 = new int[10];

        numbers2 = Arrays.copyOfRange(numbers ,0, 10);
        numbers3 = Arrays.copyOfRange(numbers, 10, 20);

        System.out.println("Первый малый массив: " + Arrays.toString(numbers2));
        System.out.println("Второй малый массив: " + Arrays.toString(numbers3));
        System.out.println("Большой массив: " + Arrays.toString(numbers));

    }

}
