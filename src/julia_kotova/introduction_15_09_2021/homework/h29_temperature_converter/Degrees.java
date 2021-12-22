package julia_kotova.introduction_15_09_2021.homework.h29_temperature_converter;

public enum Degrees {

    KELVIN("K"),
    FAHRENHEIT("F");

    private final String name;

    Degrees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
