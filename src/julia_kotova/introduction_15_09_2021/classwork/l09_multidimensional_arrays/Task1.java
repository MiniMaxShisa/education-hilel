package julia_kotova.introduction_15_09_2021.classwork.l09_multidimensional_arrays;

public class Task1 {

    public static void main(String[] args) {

        int[][] coordinates = new int[5][5];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates.length; j++) {
                if (i == j) {
                    int g = 1;
                    coordinates[i][j] = g;
                }
                System.out.print(coordinates[i][j] + " ");
            }
            System.out.println();
        }

    }

}
