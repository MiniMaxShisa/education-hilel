package julia_kotova.introduction_15_09_2021.classwork.l07_arrays;

public class Task1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        System.out.println("* * * * * * * * * *");
        int count = 0;
        while(count < 8) {
            System.out.println("*                 *");
            count++;
        }
        System.out.println("* * * * * * * * * *");
         */

    }

}
