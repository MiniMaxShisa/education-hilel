package julia_kotova.introduction_15_09_2021.classwork.l10_bitwiseoperators_recursion_stringapi;

public class BitwiseOperations {

    public static void main(String[] args) {

        int number = 46; // Integer

        System.out.println("number: " + number);
        System.out.println("Integer.toBinaryString(number): " + Integer.toBinaryString(number));

        // побитовое НЕ (меняет местами 0 и 1) - ~
        int notNumber = ~number; // Integer
        System.out.println("notNumber: " + notNumber);
        System.out.println("Integer.toBinaryString(notNumber): " + Integer.toBinaryString(notNumber));

        int n1 = 56;
        int n2 = 34;

        System.out.println("56 = " + Integer.toBinaryString(n1));
        System.out.println("34 = " + Integer.toBinaryString(n2));

        // побитовое И - &
        System.out.println("56 & 34 (n1 & n2) = " + (n1 & n2));
        System.out.println("Integer.toBinaryString(n1 & n2): " + Integer.toBinaryString(n1 & n2));

        // побитовое ИЛИ - |
        System.out.println("56 & 34 (n1 | n2) = " + (n1 | n2));
        System.out.println("Integer.toBinaryString(n1 | n2): " + Integer.toBinaryString(n1 | n2));

        // исключающее ИЛИ - ^
        System.out.println("56 & 34 (n1 ^ n2) = " + (n1 ^ n2));
        System.out.println("Integer.toBinaryString(n1 ^ n2): " + Integer.toBinaryString(n1 ^ n2));

        int n = 64;

        // сдвиг битов ВЛЕВО (умножение на 2) - << // сдвиг битов ВПРАВО (деление на 2)
        System.out.println(n + " = " + Integer.toBinaryString(n));
        System.out.println(n + " << 1 = " + (n << 1));
        System.out.println(n + " >> 1 = " + (n >> 1));
        System.out.println(n + " + Integer.toBinaryString(n << 1) = " + Integer.toBinaryString(n << 1));
        System.out.println(n + " + Integer.toBinaryString(n << 3) = " + Integer.toBinaryString(n << 3));
        System.out.println(n + " + Integer.toBinaryString(n >> 3) = " + Integer.toBinaryString(n >> 3));

    }

}
