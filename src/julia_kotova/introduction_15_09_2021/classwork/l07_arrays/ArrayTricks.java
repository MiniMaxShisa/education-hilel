package julia_kotova.introduction_15_09_2021.classwork.l07_arrays;

import java.util.Arrays;

public class ArrayTricks {

    public static void main(String[] args) {

        int[] numbers = {12, 22, 13 ,54 ,5};

        // foreach
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Arrays.toString: ");

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Arrays.sort: ");

        System.out.println(Arrays.toString(numbers));

    }

}
