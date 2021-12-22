package julia_kotova.introduction_15_09_2021.classwork.l10_bitwiseoperators_recursion_stringapi;

public class MatrixMethod {

    public static void main(String[] args) {

        int[][] matrix = createMatrix(3,5);
        fillMatrix(matrix);
        printMatrix(matrix);

    }

    public static int[][] createMatrix(int n, int m) {

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void fillMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.floor(Math.random() * 100));
            }
        }

    }

    public static void printMatrix(int[][] matrix) {

        System.out.println("Matrix:");

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
