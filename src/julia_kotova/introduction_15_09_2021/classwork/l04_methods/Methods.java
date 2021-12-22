package julia_kotova.introduction_15_09_2021.classwork.l04_methods;

public class Methods {

    public static void main(String[] args) {

        printMessage("Hello");
        printMessage("Hi");
        printMessage("Bye");

        int number = generateRandom(10);
        printMessage("random number: " + number);

        int newNumber = generateRandom(10000);
        printMessage("random number: " + newNumber);

    }

    public static void printMessage(String message) {
        System.out.println("--------------------------");
        System.out.println(message);
        System.out.println("--------------------------");
    }

    public static void printMessage(double number) {
        System.out.println("number value: " + number);
    }

    public static void printMessage(String message, double number) {
        System.out.println(message + number);
    }

    public static int generateRandom(int range) {
        return (int) (Math.random() * range);
    }

    public static String getString() {
        return "String";
    }

    public static boolean isAllowed() {
        return true; // false
    }

}
