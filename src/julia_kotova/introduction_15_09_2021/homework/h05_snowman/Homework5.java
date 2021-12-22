package julia_kotova.introduction_15_09_2021.homework.h05_snowman;

public class Homework5 {

    public static void main(String[] args) {

        double radius1 = 1;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double densityFactor = 0.7;

        double volume1 = calculateVolume(radius1);
        double volume2 = calculateVolume(radius2);
        double volume3 = calculateVolume(radius3);

        double density1 = calculateDensity(volume1, densityFactor);
        double density2 = calculateDensity(volume2, densityFactor);
        double density3 = calculateDensity(volume3, densityFactor);

        double weight = calculateWeight(density1, density2, density3);

        printMessage("weightSnowman: " + weight + "kg");
    }

    public static double calculateVolume(double radius) {
        return 1.33 * Math.PI * Math.pow(radius, 3);
    }

    public static double calculateDensity(double volume, double densityFactor) {
        return volume * densityFactor;
    }

    public static double calculateWeight (double density1, double density2, double density3) {
        return density1 + density2 + density3;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
