package julia_kotova.introduction_15_09_2021.classwork.l03_typecasting_operators_math;

public class TypeCasting {

    public static void main(String[] args) {

        System.out.println(10);

        int intNumber = 1000;
        long longNumber = 100;
        System.out.println("longNumber before auto casting: " + longNumber);

        longNumber = intNumber;
        System.out.println("longNumber after auto casting: " + longNumber);

        byte byteNumber = 10;
        short shortNumber = 100;
        System.out.println("shortNumber before auto casting: " + shortNumber);

        shortNumber = byteNumber;
        System.out.println("shortNumber after auto casting: " + shortNumber);

        byteNumber = (byte) shortNumber;
        System.out.println("byteNumber after manual casting: " + byteNumber);
    }
}
