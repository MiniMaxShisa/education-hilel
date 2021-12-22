package julia_kotova.introduction_15_09_2021.classwork.l06_for_while_dowhile;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

}
