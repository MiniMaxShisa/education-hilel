package julia_kotova.introduction_15_09_2021.homework.h29_temperature_converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static julia_kotova.introduction_15_09_2021.homework.h29_temperature_converter.Degrees.*;

public class Converter implements Convertable {

    static BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        createConverter();

    }

    private static void createConverter() throws IOException {

        Convertable forFahrenheit = degrees -> {
            double fahrenheit = degrees * 1.8 + 32;
            System.out.println("Degrees " + FAHRENHEIT + ": " + fahrenheit + FAHRENHEIT.getName());
        };

        Convertable forKelvin = degrees -> {
            double kelvin = degrees + 273.15;
            System.out.println("Degrees " + KELVIN + ": " + kelvin + KELVIN.getName());
        };

        System.out.println("Select the type of conversion: Celsius to FAHRENHEIT or Celsius to KELVIN:");
        String input = reader.readLine();

        try {

            if (!(valueOf(input) == FAHRENHEIT || valueOf(input) == KELVIN)) {
                throw new Exception();
            }

            switch (valueOf(input)) {
                case FAHRENHEIT -> {
                    System.out.println("Enter degrees Celsius: ");
                    double celsiusFahrenheit = Double.parseDouble(reader.readLine());
                    forFahrenheit.convert(celsiusFahrenheit);
                }
                case KELVIN -> {
                    System.out.println("Enter degrees Celsius: ");
                    double celsiusKelvin = Double.parseDouble(reader.readLine());
                    forKelvin.convert(celsiusKelvin);
                }

            }

        } catch (Exception e) {
            System.out.println("Choose FAHRENHEIT or KELVIN.");

        }

    }

    @Override
    public void convert(double degrees) {
    }

}
