package julia_kotova.introduction_15_09_2021.classwork.l08_arraysort_binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[1000];
        fillArray(numbers);

        long start, end;
        start = System.currentTimeMillis();

        // Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        end = System.currentTimeMillis();

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Duration: " + (end - start));
        System.out.println(Arrays.toString(numbers));

    }

    public static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.floor(Math.random() * 100));
        }

    }

}
