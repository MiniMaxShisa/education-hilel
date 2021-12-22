package julia_kotova.introduction_15_09_2021.homework.h21_negative_numbers;

public class Homework21 {

    public static void main(String[] args) {

        int[][] numbers = {{20, -12, 85}, {-6, -40, 32}};
        printMatrix(numbers);
        printNegativeAddress(numbers);

    }

    public static void printMatrix(int[][] matrix) {

        System.out.println("Матрица:");

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void printNegativeAddress(int[][] matrix) {

        System.out.println("Отрицательные числа матрицы:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println("- адрес элемента матрицы [элемент]: " + i + j + "[" + matrix[i][j] + "]");
                }
            }
        }
    }

}
