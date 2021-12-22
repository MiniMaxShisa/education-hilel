package julia_kotova.introduction_15_09_2021.homework.h20_add_and_multiply_matrices;

public class Homework20 {

    public static void main(String[] args) {

        System.out.println("Матрица C:");
        int[][] matrixC = new int[3][3];
        fillMatrix(matrixC);
        printMatrix(matrixC);

        System.out.println("Матрица D:");
        int[][] matrixD = new int[3][3];
        fillMatrix(matrixD);
        printMatrix(matrixD);

        plus(matrixC, matrixD);
        times(matrixC, matrixD);

    }

    public static void fillMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.floor(Math.random() * 100));
            }
        }

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

    public static void plus(int[][] matrix1, int[][] matrix2) {

        int[][] additionMatrix = new int[3][3];

        for (int i = 0; i < additionMatrix.length; i++) {
            for (int j = 0; j < additionMatrix[i].length; j++) {
                additionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Результат сложения матриц C и D:");
        printMatrix(additionMatrix);

    }

    public static void times(int[][] matrix1, int[][] matrix2) {

        int[][] multiplicationMatrix = new int[3][3];

        for (int i = 0; i < multiplicationMatrix.length; i++) {
            for (int j = 0; j < multiplicationMatrix[i].length; j++) {
                multiplicationMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("Результат умножения матриц C и D:");
        printMatrix(multiplicationMatrix);

    }

}
