package julia_kotova.introduction_15_09_2021.homework.h19_transpose_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework19 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Укажите ширину матрицы:");
        int matrixWidth = Integer.parseInt(reader.readLine());
        System.out.println("Укажите высоту матрицы:");
        int matrixHeight = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[matrixHeight][matrixWidth];
        fillMatrix(matrix);

        System.out.println("Ваша матрица:");
        printMatrix(matrix);

        int[][] trans = new int[matrixWidth][matrixHeight];
        transpose(matrix, trans);

        System.out.println("Транспонированная матрица:");
        printMatrix(trans);

    }

    public static void fillMatrix(int[][] matrix) throws IOException {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Внесите элемент матрицы " + i + j + ":");
                int element = Integer.parseInt(reader.readLine());
                matrix[i][j] = element;
            }
        }
        System.out.println();

    }

    public static void printMatrix(int[][] matrix) {

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void transpose(int[][] original, int[][] target) {

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                target[j][i] = original[i][j];
            }
        }

    }

}
