package julia_kotova.introduction_15_09_2021.classwork.l08_arraysort_binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 4, 2, 7, 9, 3, 6, 8, 0};

        int key = 9;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                System.out.println(mid);
                break;
            } else if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }

        }

    }

}
