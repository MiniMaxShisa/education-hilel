package julia_kotova.introduction_15_09_2021.classwork.l03_typecasting_operators_math;

public class MathOperations {

    public static void main(String[] args) {

        float a = 19;
        float b = 6;

        float c = a + b;
        System.out.println("a + b = " + c); // ("a + b = " + (a + b));

        System.out.println("b - a = " + (b - a));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        a = a + 1;
        System.out.println("a = a + 1: " + a);

        System.out.println("a++: " + a++);
        System.out.println("after a++: " + a);

        System.out.println("++a: " + ++a);

        b = b - 1;
        System.out.println("b = b - 1: " + b);

        System.out.println("b--: " + b--);
        System.out.println("after b--: " + b);

        System.out.println("--" + --b);
    }
}
