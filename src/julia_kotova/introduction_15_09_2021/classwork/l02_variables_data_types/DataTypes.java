package julia_kotova.introduction_15_09_2021.classwork.l02_variables_data_types;

public class DataTypes {

    public static void main(String[] args) {

        byte byteVariable = -128;
        System.out.println("byteVariable: " + byteVariable);

        short shortVariable = -32_768;
        System.out.println("shortVariable: " + shortVariable);

        int intVariable = -2_147_483_648;
        System.out.println("intVariable: " + intVariable);

        long longVariable = -9_223_372_036_854_775_806L;
        System.out.println("longVariable: " + longVariable);

        float floatVariable = 0.4444F;
        System.out.println("floatVariable: " + floatVariable);

        double doubleVariable = 0.88888888;
        System.out.println("doubleVariable: " + doubleVariable);

        boolean booleanVariable = true; //false
        System.out.println("booleanVariable: " + booleanVariable);

        char charVariable = 67; // symbol (number)
        System.out.println("charVariable: " + charVariable);
    }

}