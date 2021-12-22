package julia_kotova.introduction_15_09_2021.classwork.l09_multidimensional_arrays;

public class Task2 {

    public static void main(String[] args) {

        char[][] board = new char[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'B';
                } else {
                    board[i][j] = 'W';
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

}
