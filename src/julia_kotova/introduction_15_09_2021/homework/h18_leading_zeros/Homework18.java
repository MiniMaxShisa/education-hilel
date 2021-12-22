package julia_kotova.introduction_15_09_2021.homework.h18_leading_zeros;

import java.util.Arrays;

public class Homework18 {

    public static void main(String[] args) {

        int[] numbers = {2, 0, 6, 7, 0, 9, 8, 0, 6, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] == 0) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        // или Arrays.sort(numbers); подходит для сортировки 0, но не других чисел.

        /*
         * или Arrays.sort(numbers); подходит для сортировки 0, но не других чисел.
         * предыдущая версия (хуже по производительности)
           for (int i = 0; i < numbers.length; i++) {
             for (int j = 1; j < numbers.length - i; j++) {
               if (numbers[j - 1] != 0) {
                 int temp = numbers[j - 1];
                 numbers[j - 1] = numbers[j];
                 numbers[j] = temp;
               }
             }
           }
         */

    }

}
