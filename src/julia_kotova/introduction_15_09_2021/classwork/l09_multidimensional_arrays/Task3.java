package julia_kotova.introduction_15_09_2021.classwork.l09_multidimensional_arrays;

public class Task3 {

    public static void main(String[] args) {

        boolean[][][] parking = {
                // level 0
                {
                        // row 0
                        {true, false, true},
                        // row 1
                        {true, false, true},
                        // row 2
                        {true, false, true},
                },
                // level 1
                {
                        {true, false, true},
                        {true, false, true},
                        {true, false, true},
                },
                // level 2
                {
                        {true, false, true},
                        {true, false, true},
                        {true, false, true},
                }
        };

        for (int i = 0; i < parking.length; i++) {
            System.out.println("Level " + i);
            for (int j = 0; j < parking[i].length; j++) {
                for (int k = 0; k < parking[i][j].length; k++) {
                    System.out.print(parking[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
