package julia_kotova.introduction_15_09_2021.homework.h12_unlucky_numbers;

public class Homework12 {

    public static void main(String[] args) {

        int count = 0;
        int newCount = 0;

        while (newCount < 100) {
            String stringCount = String.valueOf(++newCount);
            if ((stringCount.contains("4") || stringCount.contains("9")))
                continue;
            System.out.println(newCount);
            count++;

        }

    }

}

/*
            for (int i = 0; i < 9; i++) {
              for (int j = 0; j < 9; j++) {
                if (i != 4 && j != 4)
                  System.out.println(i + "" + j);
            }
 */
