package julia_kotova.introduction_15_09_2021.homework.h06_aircraft_method_overloading;

public class Homework6 {

    public static void main(String[] args) {

        String airplane1 = printAirplaneInfo("Jet", "F-22 Raptor");
        String airplane2 = printAirplaneInfo("Airliner", "Aerobus 737", 120);
        String airplane3 = printAirplaneInfo("Airliner", "Boeing 777", 180, 28);

    }

    public static String printAirplaneInfo(String title, String type) {
        System.out.println("Тип самолета: " + title + ", модель: " + type);
        return "String";
    }

    public static String printAirplaneInfo(String title, String type, int amountEconomy) {
        System.out.println("Тип самолета: " + title + ", модель: " + type + ", кол. пасажиров эконом класса: " + amountEconomy);
        return "String";
    }

    public static String printAirplaneInfo(String title, String type, int amountEconomy, int amountBusiness) {
        System.out.println("Тип самолета: " + title + ", модель: " + type + ", кол. пасажиров эконом класса: " + amountEconomy + ", кол. пасажиров бизнесс класа:" + amountBusiness);
        return "String";
    }

}
