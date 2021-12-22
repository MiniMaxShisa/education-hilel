package julia_kotova.introduction_15_09_2021.classwork.l03_typecasting_operators_math;

public class JavaMath {

    public static void main(String[] args) {

        int abs = Math.abs(-200);
        System.out.println("abs: " + abs);

        double pow = Math.pow(2, 8);
        System.out.println("pow: " + pow);

        long round = Math.round(5.9);
        System.out.println("round: " + round);

        double random = Math.random();
        System.out.println("random: " + (int) (random * 100000));
    }
}
