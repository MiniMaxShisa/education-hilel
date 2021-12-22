package julia_kotova.introduction_15_09_2021.homework.h17_lottery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Homework17 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Integer[] numbers = new Integer[7];
        fillArray(numbers);

        System.out.println("Угадайте семь загаданных чисел от 0 до 9:");
        Integer[] numbersGuessed = new Integer[7];
        fillArray2(numbersGuessed);

        searchCoincidence(numbers, numbersGuessed);

    }

    public static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.floor(Math.random() * 10));
        }

    }

    public static void searchCoincidence(Integer[] array, Integer[] array2) {

        Arrays.sort(array);
        Arrays.sort(array2);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array2[i])
                count++;
        }

        System.out.println("Загаданные числа: " + Arrays.toString(array));
        System.out.println("Ваши числа: " + Arrays.toString(array2));
        System.out.println("Количество совпадений: " + count);
    }

    public static void fillArray2(Integer[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

    }

}
