package julia_kotova.introduction_15_09_2021.homework.h04_math;

public class Homework4 {

    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        double abs = Math.abs(a - b);
        double pow = Math.pow(a + b, 3);
        double sqrt = Math.sqrt(c);
        double result = abs / pow - sqrt;

        System.out.println("| a- b | / (a + b) ^3 - √c = " + result);

        /*
        -----OR:-----

        double a = 10;
        double b = 20;
        double c = 30;

        double result = (Math.abs(a -b) / Math.pow(a + b, 3) - Math.sqrt(c));

        System.out.println("| a- b | / (a + b) ^3 - √c = " + result);
        */
    }

}
