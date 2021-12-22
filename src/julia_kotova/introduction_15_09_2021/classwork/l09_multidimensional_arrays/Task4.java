package julia_kotova.introduction_15_09_2021.classwork.l09_multidimensional_arrays;

public class Task4 {

    public static void main(String[] args) {

        int[][] original = {{6, 4, 24}, {1, -9, 8}};
        int[][] target = new int[3][2];

        for (int[] ints : original) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                target[j][i] = original[i][j];
            }
        }

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                System.out.print(target[i][j] + " ");
            }
            System.out.println();
        }

    }

}

