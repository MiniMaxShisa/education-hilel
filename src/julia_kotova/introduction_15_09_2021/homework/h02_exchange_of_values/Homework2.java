package julia_kotova.introduction_15_09_2021.homework.h02_exchange_of_values;

public class Homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}