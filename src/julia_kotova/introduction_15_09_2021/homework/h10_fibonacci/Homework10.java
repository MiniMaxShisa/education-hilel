package julia_kotova.introduction_15_09_2021.homework.h10_fibonacci;

public class Homework10 {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c;

        System.out.print("Последовательность Фибоначчи: " + a + " " + b);

        for (int i = 3; i <= 12; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }

}
